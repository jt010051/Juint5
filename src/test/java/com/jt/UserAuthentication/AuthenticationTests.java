package com.jt.UserAuthentication;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jt.UserAuthentication.model.UserEntity;
@SpringBootTest

public class AuthenticationTests {
	@Autowired
	MyUserDetailsService service;
    
    @TestConfiguration
    static class AuthenticationTestsConfiguration {
    	@Bean
    	public MyUserDetailsService service() {
    		return new MyUserDetailsService();
    	}
    }
@BeforeAll
public static void begin() {
	
	System.out.println("Let's get Started\n");
}

    
    
    @Test
    public void whenExistsByEmailAndPassword_thenReturnTrue() {
    	// given
    	UserEntity dummyUser = new UserEntity();
        dummyUser.setUserName("Dummy");
        dummyUser.setEmail("test@test.com");
        dummyUser.setPassword("password");
        service.AddUser(dummyUser);

        // when
        boolean found = service.AuthenticateByEmail(dummyUser.getEmail(), dummyUser.getPassword());
        // then
        assertTrue(found);
        
    }
    
    @Test
    public void whenAddNullUser_thenReturnFalse() {
    	
    	UserEntity dummyUser = null;
    	boolean addUser = service.AddUser(dummyUser);
    	
    	assertFalse(addUser);
    }

    @Test
    public void whenAddUser_thenReturnTrue() {
    	//given
    	
    	UserEntity dummyUser = new UserEntity();
    	dummyUser.setUserName("Appa");
        dummyUser.setEmail("avatar@nick.com");
        dummyUser.setPassword("aang");
        
        // when
        boolean newUser = service.AddUser(dummyUser);
        // then
        assertTrue(newUser);
        
    }
    
    
}
