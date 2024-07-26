package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MyUser;
import com.example.demo.repo.MyUserRepo;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	MyUserRepo myUserRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		MyUser myUser = myUserRepo.findByUsername(username).get();

		return User.builder().username(myUser.getUsername()).password(myUser.getPassword())
				.roles(myUser.getRoles().split(",")).build();

	}

}
