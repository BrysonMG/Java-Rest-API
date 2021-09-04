package com.javaapi.restapi.Controller;

import com.javaapi.restapi.Models.User;
import com.javaapi.restapi.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private IUserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {

        return "Welcome";
    }

    @GetMapping(value="/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value="/add")
    public String addUser(@RequestBody User user) {
        userRepo.save(user);
        return "Saved!";
    }

    @PutMapping("update/{id}")
    public String updateUser(int id, @RequestBody User user) {
        User updatedUser = userRepo.findById(id).get();
    }
}
