package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    

    UserRepository userRepo;

    public User saveUser(User user){ return userRepo.save(user); }

    public User getUser(Long id){ return userRepo.findById(id).orElseThrow(() -> new RuntimeException("cannot find User")); }

    public void deleteUser(Long id){ userRepo.deleteById(id);}

    
}
