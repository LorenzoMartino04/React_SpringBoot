package com.example.CRUD.controller;

import com.example.CRUD.dto.UserDto;
import com.example.CRUD.model.User;
import com.example.CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/SignUp")
    public ResponseEntity<String> signUp(@RequestBody UserDto userDto) {
        userService.signUp(userDto);
        return ResponseEntity.ok("ok");
    }

    @PostMapping("/DeleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody UserDto userDto) {
        userService.deleteUser(userDto);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);
    }

    @PostMapping("/Login")
    public ResponseEntity<String> Login(@RequestBody UserDto userDto) {
        userService.Login(userDto);
        return ResponseEntity.ok("ok");
    }
}
