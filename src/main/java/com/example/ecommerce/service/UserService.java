package com.example.ecommerce.service;


import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
 

   

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }



	public void registerUser1(User user) {
		
		
	}




	public com.example.ecommerce.model.User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
