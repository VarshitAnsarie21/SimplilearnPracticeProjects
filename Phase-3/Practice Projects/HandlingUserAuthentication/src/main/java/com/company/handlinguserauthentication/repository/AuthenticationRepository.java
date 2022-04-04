package com.company.handlinguserauthentication.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.company.handlinguserauthentication.entity.User;

public interface AuthenticationRepository extends CrudRepository<User, Integer>{

	public Optional<User> findUserByName(String name);
}
