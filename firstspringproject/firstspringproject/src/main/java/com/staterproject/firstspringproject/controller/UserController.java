package com.staterproject.firstspringproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staterproject.firstspringproject.model.User;
import com.staterproject.firstspringproject.service.UserService;

@RestController
public class UserController {
	
	  @Autowired
	  UserService userService;
	  
     @GetMapping("/list")
     public List<User> getUser() {
    	 List<User> us=this.userService.getAllUser();
    	 for(User u:us) {
    		 System.out.print(u);
    	 }
    	 
    	 return us;
     }
     
     @GetMapping("/list/{id}")
     public Optional<User> getUserById(@PathVariable int id ) {
    	 Optional<User> us=this.userService.getbyid(id);
    	 return us;
     }
     
     @PostMapping("/list")
     public void addBook(@RequestBody User user) {
    	 userService.addUser(user);
     }
 
     @PutMapping("/list/{id}")
     public void updateUser(@RequestBody User user,@PathVariable int id) {
    	 userService.updateUser(user,id);
     }
     
     @DeleteMapping("/list/{id}")
     public User deleteUser(@PathVariable int id) {
    	 User us=userService.deleteUser(id);
    	 return us;
     }
}
