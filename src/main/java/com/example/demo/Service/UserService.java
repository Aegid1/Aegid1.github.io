package com.example.demo.Service;
import com.example.demo.*;
import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserCreateRequest;
import com.example.demo.UserRepository;
import com.example.demo.Entity.UserEntity;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    public User saveUser(UserCreateRequest userRequest){

        var userEntity = new UserEntity(userRequest.getFirstname(), 
                                            userRequest.getLastname(), 
                                            userRequest.getEmail(), 
                                            userRequest.getPassword());

        userEntity = userRepo.save(userEntity);

        return transformToUser(userEntity);

    }

    public User transformToUser(UserEntity userEntity){

        return new User(userEntity.getId(),
                        userEntity.getFirstname(),
                        userEntity.getLastname(),
                        userEntity.getEmail(),
                        userEntity.getPassword());

    }

    public UserEntity getUser(Long id){ return userRepo.findById(id).orElseThrow(() -> new RuntimeException("cannot find User")); }

    public void deleteUser(Long id){ userRepo.deleteById(id);}

    
}
