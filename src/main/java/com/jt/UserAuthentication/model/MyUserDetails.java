package com.jt.UserAuthentication.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
	private String userName;
	private String password;
public MyUserDetails(String userName) {
	this.userName = userName;
	

}
@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
}
@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return "opensesame";
}
@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return "jt0100";
}
@Override
public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean isEnabled() {
	// TODO Auto-generated method stub
	return true;
}

	
}
