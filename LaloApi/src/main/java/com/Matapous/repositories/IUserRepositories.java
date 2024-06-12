package com.Matapous.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Matapous.models.userModel;

@Repository
public interface IUserRepositories extends JpaRepository<userModel, Long> {

    
}
