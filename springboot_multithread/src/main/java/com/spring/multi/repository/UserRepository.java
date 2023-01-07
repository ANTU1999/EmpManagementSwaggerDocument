package com.spring.multi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.multi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
