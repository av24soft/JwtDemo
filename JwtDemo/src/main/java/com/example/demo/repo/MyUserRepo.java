package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MyUser;

public interface MyUserRepo extends JpaRepository<MyUser, Long>{

	
	Optional<MyUser> findByUsername(String myUserRepo);
}
