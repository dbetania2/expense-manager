package com.example.expense_manager.controller;

import com.example.expense_manager.model.User;
import com.example.expense_manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "index"; // Nombre del archivo Thymeleaf (index.html)
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "userList"; // Nombre del archivo Thymeleaf para la lista de usuarios
    }

    // Puedes agregar más métodos para manejar otras rutas relacionadas con usuarios
}
