package com.yyy.shop.controller;

import com.yyy.shop.model.Role;
import com.yyy.shop.model.User;
import com.yyy.shop.service.RoleService;
import com.yyy.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;


    @ModelAttribute
    User user(){
        return new User();
    }


    @GetMapping("/sign-up-user")
    public ModelAndView showFormSignUpUser(){
        ModelAndView modelAndView = new ModelAndView("user/sign-up-user");
        List<Role> roleList = roleService.findAll();
        modelAndView.addObject("roleList",roleList);
        return modelAndView;
    }

    @PostMapping("/sign-up-user")
    public ModelAndView createUser(@ModelAttribute User user){
        userService.saveUser(user);
        ModelAndView modelAndView = new ModelAndView("user/sign-up-success");
        modelAndView.addObject("username",user.getUsername());
        return modelAndView;
    }
}
