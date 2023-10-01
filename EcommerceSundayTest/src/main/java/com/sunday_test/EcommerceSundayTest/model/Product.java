package com.sunday_test.EcommerceSundayTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Product {

@Id
@NotNull
   private Integer productId;

    @NotNull
   private String productName;

    private  Integer productPrice;

    private  String productDesc;

    private String productCategory;

    private String productBrand;
}
