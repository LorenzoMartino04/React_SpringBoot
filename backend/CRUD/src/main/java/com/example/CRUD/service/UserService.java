package com.example.CRUD.service;

import com.example.CRUD.dto.UserDto;
import com.example.CRUD.model.User;
import com.example.CRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void signUp(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassowrd(userDto.getPassword());
        userRepository.save(user);
    }

    public void deleteUser(UserDto userDto) {
        User user = userRepository.findByUsernameAndEmailAndPassword(userDto.getUsername(), userDto.getEmail(), userDto.getPassword());
        userRepository.delete(user);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
