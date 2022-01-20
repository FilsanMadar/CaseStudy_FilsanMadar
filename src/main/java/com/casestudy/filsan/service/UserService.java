package com.casestudy.filsan.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.casestudy.filsan.controller.dto.UserRegistrationDto;
import com.casestudy.filsan.model.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
