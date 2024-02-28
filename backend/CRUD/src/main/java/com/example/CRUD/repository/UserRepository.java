package com.example.CRUD.repository;

import com.example.CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsernameAndEmailAndPassword(String username, String email, String password);

    List<User> findAll();
}
