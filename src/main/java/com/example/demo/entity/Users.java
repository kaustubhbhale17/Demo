package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor //because of lombok package
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;
    private String email;
    private String password;


}
