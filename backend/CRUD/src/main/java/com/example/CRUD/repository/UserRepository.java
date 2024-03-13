package com.example.CRUD.repository;

import com.example.CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsernameAndEmailAndPassword(String username, String email, String password);

    @Query("SELECT u FROM User u WHERE u.email=:email and u.password=:password")
    User findByEmailAndPassword(@Param("email")String email, @Param("password")String password);

    List<User> findAll();


}
