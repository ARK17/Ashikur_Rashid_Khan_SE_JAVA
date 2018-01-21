package com.ark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DefaultController {
    @GetMapping("/")
    public String home1() {
        return "/home";
    }
    @GetMapping("/home")
    public String home() {
        return "/home";
    }
    @GetMapping("/dashboard")
    public String dashboard() {
        return "/dashboard";
    }
    @GetMapping("/addproducts")
    public String addproducts() {
        return "/addproducts";
    }
    @GetMapping("/displayallproducts")
    public String displayAll() {
        return "/displayallproducts";
    }
    @GetMapping("/updateproducts")
    public String updateProduct() {
        return "/updateproducts";
    }
    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
