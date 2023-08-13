package com.staterproject.firstspringproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staterproject.firstspringproject.model.User;
import com.staterproject.firstspringproject.repo.UserRepository;

@Service
public class UserService {
    @Autowired
	UserRepository userRepository;
    List<User> allusers=new ArrayList<User>();;
    
    public List<User> getAllUser() {
    	return userRepository.findAll();
    }
    
    public Optional<User> getbyid(int id) {
    	return userRepository.findById(id);
    }
    
   public void addUser(User user) {
	   userRepository.save(user);
   }
   
   public void updateUser(User user ,int id) {
	   Optional<User> ar=userRepository.findById(id);
	   User us=ar.get();
	   us.setCity(user.getCity());
	   us.setName(user.getName());
	   us.setStatus(user.getStatus());
	   userRepository.save(us);
   }
   
   public User deleteUser(int id) {
	   Optional<User> ar=userRepository.findById(id);
	   userRepository.deleteById(id);
	   return ar.get();
   }
}
