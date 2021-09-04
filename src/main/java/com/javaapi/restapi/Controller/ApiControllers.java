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

    @PutMapping(value="update/{id}")
    public String updateUser(Long id, @RequestBody User user) {
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setAge(user.getAge());
        updatedUser.setOccupation(user.getOccupation());
        userRepo.save(updatedUser);
        return "Updated!";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteUser(@PathVariable long id) {
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Deleted!";
    }
}
