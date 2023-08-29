package com.victor.ws.services;

import com.victor.ws.data.User;
import com.victor.ws.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findChatUsers(){
        return userRepository.findAll();
    }
}
