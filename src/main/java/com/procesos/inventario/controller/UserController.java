package com.procesos.inventario.controller;

import com.procesos.inventario.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("users/{id}")
    public User getUserById(@PathVariable Long id){
        User user = new User(id, "Juan", "Mora", "Esperanza", "Juan.0909.123@gmail.com", "3165484641", "48486548", "106321141");
        return user;
    }
}
