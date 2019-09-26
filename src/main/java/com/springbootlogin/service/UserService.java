package com.springbootlogin.service;

import com.springbootlogin.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}