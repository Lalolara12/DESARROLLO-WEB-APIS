package com.Matapous.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Matapous.models.userModel;
import com.Matapous.repositories.IUserRepositories;

@Service
public class userService {
    
    @Autowired
    IUserRepositories userRepositories;
    
    public ArrayList<userModel> getUsers(){
        return (ArrayList<userModel>) userRepositories.findAll();
    }

    public userModel saveUser(userModel user) {
        return userRepositories.save(user);
    }

    public Optional <userModel> getById(Long id){
        return userRepositories.findById(id);
    }

    public userModel updateById(userModel request, Long id) {
        userModel user = userRepositories.findById(id).get();

        user.setpersonaje(request.getpersonaje());
        user.sethabilidad(request.gethabilidad());
        
        return user;
    }

    public Boolean deleteUser (Long id){
        try {
            userRepositories.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
