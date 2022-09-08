package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users user){

        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Users findUserById(@PathVariable("id") Long userId){

        return userService.findUserById(userId);
    }

//    @GetMapping("/")
//    public List<Users> getAllUsers(){
//
//        return userService.getAllUsers();
//    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id){
//        return userService.deleteUser(id);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Users> updateUser(@PathVariable("id") Long id, @RequestBody Users user){
//        return userService.updateUser(id,user);
//    }
}
