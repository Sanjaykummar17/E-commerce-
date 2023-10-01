package com.sunday_test.EcommerceSundayTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;

   private String userEmail;

   private String password;

   private Integer phoneNumber;

}
