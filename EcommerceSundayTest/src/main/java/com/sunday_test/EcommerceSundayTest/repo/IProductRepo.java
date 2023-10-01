package com.sunday_test.EcommerceSundayTest.repo;

import com.sunday_test.EcommerceSundayTest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product where product_category =:category", nativeQuery = true)
   List<Product> getProductsOfCategory(String category);
}
