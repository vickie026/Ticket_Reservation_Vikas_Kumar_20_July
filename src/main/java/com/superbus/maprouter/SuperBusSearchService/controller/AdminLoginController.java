package com.superbus.maprouter.SuperBusSearchService.controller;

import com.superbus.maprouter.SuperBusSearchService.exceptions.AdminException;
import com.superbus.maprouter.SuperBusSearchService.exceptions.LoginException;
import com.superbus.maprouter.SuperBusSearchService.model.AdminLoginDTO;
import com.superbus.maprouter.SuperBusSearchService.model.CurrentAdminSession;
import com.superbus.maprouter.SuperBusSearchService.service.AdminLoginService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/superbus")
public class AdminLoginController {

    @Autowired
    private AdminLoginService loginService;

    @PostMapping("/admin/login")
    public ResponseEntity<CurrentAdminSession> loginAdmin(@Valid @RequestBody AdminLoginDTO loginDTO) throws AdminException, LoginException {
//        System.out.println(loginDTO);
    	CurrentAdminSession currentAdminSession = loginService.adminLogin(loginDTO);
        return new ResponseEntity<>(currentAdminSession, HttpStatus.ACCEPTED);
    }

    @PostMapping("/admin/logout")
    public String logoutAdmin(@Valid @RequestParam(required = false) String key) throws LoginException {
        return loginService.adminLogout(key);
    }
}
