package com.sunday_test.EcommerceSundayTest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "userOrder")
public class Order {
@Id
    @NotNull
   private Integer orderId;

    @OneToOne
    @JoinColumn(name = "fk_user")
    User user;

    @OneToOne
    @JoinColumn(name = "fk_product")
   Product product;

    @OneToOne
    @JoinColumn(name = "fk_address")
    Address address;


    private Integer productQuantity;


}
