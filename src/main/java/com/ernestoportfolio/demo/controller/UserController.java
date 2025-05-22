package com.ernestoportfolio.demo.controller;

import com.ernestoportfolio.demo.model.User;
import com.ernestoportfolio.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Hämta alla användare
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Hämta användare via e-post (om du vill testa det också)
    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userRepository.findByEmail(email);
    }
}
