package com.superbus.maprouter.SuperBusSearchService.service;

import com.superbus.maprouter.SuperBusSearchService.exceptions.AdminException;
import com.superbus.maprouter.SuperBusSearchService.exceptions.UserException;
import com.superbus.maprouter.SuperBusSearchService.model.User;

import java.util.List;

public interface UserService {
    public User createUser(User user) throws UserException;
    public User updateUser(User user, String key) throws UserException;
    public User deleteUser(Integer userId, String key) throws UserException, AdminException;
    public User viewUserById(Integer userId, String key) throws UserException, AdminException;
    public List<User> viewAllUser(String key) throws UserException, AdminException;
}
