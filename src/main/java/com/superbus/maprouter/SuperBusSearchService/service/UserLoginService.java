package com.superbus.maprouter.SuperBusSearchService.service;

import com.superbus.maprouter.SuperBusSearchService.exceptions.LoginException;
import com.superbus.maprouter.SuperBusSearchService.model.CurrentUserSession;
import com.superbus.maprouter.SuperBusSearchService.model.UserLoginDTO;

public interface UserLoginService {
    public CurrentUserSession userLogin(UserLoginDTO userLoginDTO) throws LoginException;
    public String userLogout(String key) throws LoginException;
}
