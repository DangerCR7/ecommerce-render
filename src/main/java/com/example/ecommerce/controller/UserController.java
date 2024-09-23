package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import com.example.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }
   

    @PostMapping("/register")
    public String handleRegister(User user, Model model) {
        // Handle user registration logic
        return "redirect:/login"; // Redirect to the main e-commerce page after successful registration
    }

  
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLoginforn(User user, Model model) {
        // Handle user registration logic
        return "redirect:/ecommerce"; // Redirect to the main e-commerce page after successful registration
    }
    @GetMapping("/ecommerce")
    public String showEcommercePage(Model model) {
        // You can add any necessary data to the model here
        return "ecommerce";  // This should match the name of your HTML file without the extension
    }
    
    @GetMapping("/cart")
    public String showCartForm() {
        return "cart";
    }
    @GetMapping("/order")
    public String showOrderForm() {
        return "order";
    }
       
    @GetMapping("/success")
    public String showSuccessForm() {
        return "success";
    }

    @PostMapping("/success")
    public String handleLSuccessForm(User user, Model model) {
        // Handle user registration logic
        return "redirect:/success"; // Redirect to the main e-commerce page after successful registration
    }
    
    
    
    


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
   
}
