package com.senati.senati_web_casafranca.controller;

import com.senati.senati_web_casafranca.model.Response;
import com.senati.senati_web_casafranca.model.User;
import com.senati.senati_web_casafranca.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/api/user")
    public ResponseEntity<User> saveUser(@RequestBody User users) {
        return userService.newUser(users);
    }
    @DeleteMapping("/api/user/{id}")
    public Response deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
    @PutMapping("/api/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}
