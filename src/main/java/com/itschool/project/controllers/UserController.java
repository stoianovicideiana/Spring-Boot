package com.itschool.project.controllers;

import com.itschool.project.models.dtos.UserDTO;
import com.itschool.project.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/users")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<List<UserDTO>> getUsers(@PathVariable String id) {
        return ResponseEntity.ok(userService.getUsers());
    }
}