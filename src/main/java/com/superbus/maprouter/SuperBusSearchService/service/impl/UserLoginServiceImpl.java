package com.superbus.maprouter.SuperBusSearchService.service.impl;

import com.superbus.maprouter.SuperBusSearchService.exceptions.LoginException;
import com.superbus.maprouter.SuperBusSearchService.model.CurrentUserSession;
import com.superbus.maprouter.SuperBusSearchService.model.User;
import com.superbus.maprouter.SuperBusSearchService.model.UserLoginDTO;
import com.superbus.maprouter.SuperBusSearchService.repositories.CurrentUserSessionRepository;
import com.superbus.maprouter.SuperBusSearchService.repositories.UserRepository;
import com.superbus.maprouter.SuperBusSearchService.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.security.SecureRandom;
import java.util.Base64;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CurrentUserSessionRepository userSessionRepository;

    @Override
    public CurrentUserSession userLogin(UserLoginDTO userLoginDTO) throws LoginException {
        User registeredUser = userRepository.findByEmail(userLoginDTO.getEmail());
        if(registeredUser == null) throw new LoginException("Please enter valid email!");

        Optional<CurrentUserSession> loggedInUser =  userSessionRepository.findById(registeredUser.getUserID());
        if(loggedInUser.isPresent()) throw new LoginException("User already Logged!");

        if(registeredUser.getPassword().equals(userLoginDTO.getPassword())) {
        	SecureRandom secureRandom = new SecureRandom();
            byte[] keyBytes = new byte[10];
            secureRandom.nextBytes(keyBytes);
            
            String key = Base64.getEncoder().encodeToString(keyBytes);
        	
        	CurrentUserSession currentUserSession = new CurrentUserSession();
            currentUserSession.setUserID(registeredUser.getUserID());
            currentUserSession.setUuid(key);
            currentUserSession.setTime(LocalDateTime.now());
            return userSessionRepository.save(currentUserSession);
        }else
            throw new LoginException("Please enter a valid password!");
    }

    @Override
    public String userLogout(String key) throws LoginException {
        CurrentUserSession loggedInUser = userSessionRepository.findByUuid(key);
        if(loggedInUser == null)  throw new LoginException("Please enter a valid key or login first!");
        userSessionRepository.delete(loggedInUser);
        return "User logged out!";
    }
}
