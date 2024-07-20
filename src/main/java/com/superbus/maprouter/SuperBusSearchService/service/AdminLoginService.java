package com.superbus.maprouter.SuperBusSearchService.service;

import com.superbus.maprouter.SuperBusSearchService.exceptions.AdminException;
import com.superbus.maprouter.SuperBusSearchService.exceptions.LoginException;
import com.superbus.maprouter.SuperBusSearchService.model.AdminLoginDTO;
import com.superbus.maprouter.SuperBusSearchService.model.CurrentAdminSession;

public interface AdminLoginService {
    public CurrentAdminSession adminLogin(AdminLoginDTO loginDTO) throws LoginException, AdminException;
    public String adminLogout(String key) throws LoginException;
}
