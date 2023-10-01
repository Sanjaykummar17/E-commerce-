package com.sunday_test.EcommerceSundayTest.repo;

import com.sunday_test.EcommerceSundayTest.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IOrderRepo extends JpaRepository<Order, Integer> {
    @Query(value = "select * from user_order where fk_product =:productId", nativeQuery = true)
    Order getOrderByProductId(Integer productId);
}
