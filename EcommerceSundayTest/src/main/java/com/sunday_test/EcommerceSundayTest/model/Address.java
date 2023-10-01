package com.sunday_test.EcommerceSundayTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
   private Integer addressId;

   private  String addressName;

   private String landMark;

    private  Integer phoneNumber;

    private  String zipCode;

   private  String state;

   @OneToOne
    @JoinColumn(name = "fk_user")
   User user;
}
