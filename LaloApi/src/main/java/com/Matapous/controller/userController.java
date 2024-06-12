package com.Matapous.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Matapous.models.userModel;
import com.Matapous.services.userService;


@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    @GetMapping
    public ArrayList<userModel> getusers() { return this.userService.getUsers();
    }

    @PostMapping
    public userModel saveUser(@RequestBody userModel user) {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<userModel> getusersById(@PathVariable("id") long id){
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public userModel updateuserbyid (@RequestBody userModel request,@PathVariable("id") long id){
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String eleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);

        if(ok){
            return "User with id " + id + " deleted!";
        } else {
            return "Error we have a problem and can't delete id" + id; 
        }

    }
}