package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProducer userProducer;


    @Transactional
    public UserModel save(UserModel userModel) {
        userRepository.save(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;
    }


    public List<UserModel> findAll() {return userRepository.findAll();}

    public UserModel findOne(UUID id) {return userRepository.findById(id).orElse(null);}
}
