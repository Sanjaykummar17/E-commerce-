package com.sunday_test.EcommerceSundayTest.controller;

import com.sunday_test.EcommerceSundayTest.model.Address;
import com.sunday_test.EcommerceSundayTest.model.Order;
import com.sunday_test.EcommerceSundayTest.model.Product;
import com.sunday_test.EcommerceSundayTest.model.User;
import com.sunday_test.EcommerceSundayTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    // ---------------------add Users
@PostMapping("users")
public String userAdd(@RequestBody List<User> users ){
    return userService.addUsers(users);
}

//--------------------- add products
    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> products ){
        return userService.addProducts(products);
    }

//------------------------- add address
@PostMapping("addresses")
public String addAddresses(@RequestBody List<Address> addresses ){
    return userService.addAddresses(addresses);
}

// ----------------- order place
@PostMapping("order")
public String addOrder(@RequestBody Order order ){
    return userService.addOrder(order);
}

//      -------------------get order by orderId
    @GetMapping("order/orderId/{orderId}")
    public Order getOrder(@PathVariable Integer orderId){
    return userService.getOrderById(orderId);
    }

    // ----------------------get user by UserId
    @GetMapping("user/userId/{userId}")
    public User getUserById(@PathVariable Integer userId){
    return userService.getUserByUserId(userId);
    }

    //-----------------------get all products of given category
       @GetMapping("products/category/{category}")
    public  List<Product> getProductsOfCategory(@PathVariable String category){
    return userService.getProductsOfCategory(category);
    }

    // -----------------delete product by productId

@DeleteMapping("product/productId/{productId}")
    public String deleteProductByProductId(Integer productId){
       return userService.deleteProductByProductId(productId);

}

















}
