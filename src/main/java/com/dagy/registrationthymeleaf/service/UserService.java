/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dagy.registrationthymeleaf.service;

import com.dagy.registrationthymeleaf.model.User;
import com.dagy.registrationthymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author dagy
 */
public interface UserService extends UserDetailsService{
    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
