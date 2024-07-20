package com.superbus.maprouter.SuperBusSearchService.controller;

import com.superbus.maprouter.SuperBusSearchService.exceptions.LoginException;
import com.superbus.maprouter.SuperBusSearchService.model.CurrentUserSession;
import com.superbus.maprouter.SuperBusSearchService.model.UserLoginDTO;
import com.superbus.maprouter.SuperBusSearchService.service.UserLoginService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/superbus")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("/user/login")
    public ResponseEntity<CurrentUserSession> logInUser(@Valid @RequestBody UserLoginDTO loginDTO) throws LoginException {
        CurrentUserSession currentUserSession = userLoginService.userLogin(loginDTO);
        return new ResponseEntity<CurrentUserSession>(currentUserSession, HttpStatus.ACCEPTED );
    }

    @PostMapping("/user/logout")
    public String logoutUser(@RequestParam(required = false) String key) throws LoginException {
        return userLoginService.userLogout(key);
    }

}
