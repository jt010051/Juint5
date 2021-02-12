package com.jt.UserAuthentication;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jt.UserAuthentication.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	 public UserEntity findByUserName(String userName);
	    public UserEntity findByEmail(String Email);
	    public boolean existsByEmailAndPassword(String Email, String password);
}
