package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Users saveUser(Users user) {

        return userRepository.save(user);
    }


    public Users findUserById(Long userId) {

        return userRepository.findByUserId(userId);
    }


//    public List<Users> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//
//    public ResponseEntity<HttpStatus> deleteUser(long id) {
//        try{
//            userRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//
//    }
//
//    public ResponseEntity<Users> updateUser(Long id, Users user) {
//        Optional<Users> userData = userRepository.findById(id);
//        if(userData.isPresent()){
//            Users u = userData.get();
//            u.setEmail(user.getEmail());
//            u.setPassword(u.getPassword());
//            userRepository.save(u);
//            return new ResponseEntity<>(u,HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
