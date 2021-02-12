package com.jt.UserAuthentication;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jt.UserAuthentication.model.MyUserDetails;
import com.jt.UserAuthentication.model.UserEntity;
@Service
public class MyUserDetailsService {

    @Autowired
    private UserRepository userRepository;
    public UserDetails loadUserByUsername(String s) {
    	return new MyUserDetails(s);
    	
    }
    public boolean AddUser(UserEntity newUser) {
        if (newUser == null) {
        	return false;
        }
        userRepository.save(newUser);
        return true;
    }

    public UserEntity GetUserByName(String userName) {
    	return userRepository.findByUserName(userName);
    }
    
    public UserEntity GetUserByEmail(String Email) {
    	return userRepository.findByEmail(Email);
    }
    
    public boolean AuthenticateByEmail(String Email, String password) {
    	return userRepository.existsByEmailAndPassword(Email, password);
    }

    public boolean AuthenticateUser(UserEntity user, String enteredPassword)
    {
        return (user.getPassword().equals(enteredPassword));
    }

}
