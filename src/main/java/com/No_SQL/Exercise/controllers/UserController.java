package com.No_SQL.Exercise.controllers;

import com.No_SQL.Exercise.entities.User;
import com.No_SQL.Exercise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(value = "")
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @PutMapping(value = "/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) throws Exception {
        if (!userRepository.existsById(id)) throw new Exception("User is not found");
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }


}
