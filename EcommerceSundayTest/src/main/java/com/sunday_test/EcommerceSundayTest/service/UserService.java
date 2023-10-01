package com.sunday_test.EcommerceSundayTest.service;

import com.sunday_test.EcommerceSundayTest.model.Address;
import com.sunday_test.EcommerceSundayTest.model.Order;
import com.sunday_test.EcommerceSundayTest.model.Product;
import com.sunday_test.EcommerceSundayTest.model.User;
import com.sunday_test.EcommerceSundayTest.repo.IAddressRepo;
import com.sunday_test.EcommerceSundayTest.repo.IOrderRepo;
import com.sunday_test.EcommerceSundayTest.repo.IProductRepo;
import com.sunday_test.EcommerceSundayTest.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;
    @Autowired
    IProductRepo productRepo;

    @Autowired
    IAddressRepo addressRepo;
    @Autowired
    IOrderRepo orderRepo;

    public String addUsers(List<User> users) {
      userRepo.saveAll(users);
      return users.size() + " added";
    }

    public String addProducts(List<Product> products) {
        productRepo.saveAll(products);
        return products.size() + " added";
    }

    public String addAddresses(List<Address> addresses) {
        addressRepo.saveAll(addresses);
        return  addresses.size() + " added";
    }

    public String addOrder(Order order) {
        orderRepo.save(order);
        return  " order placed";
    }

    public Order getOrderById(Integer orderId) {
        return orderRepo.findById(orderId).orElseThrow();
    }

    public User getUserByUserId(Integer userId) {
        return userRepo.findById(userId).orElseThrow();
    }

    public  List<Product> getProductsOfCategory(String category) {
        return productRepo.getProductsOfCategory(category);
    }

    public String deleteProductByProductId(Integer productId) {
       Order order = orderRepo.getOrderByProductId(productId);

        // ---- order delete if order placed on productId(given above)-----
       if(order != null) {
           orderRepo.deleteById(order.getOrderId());
       }
        productRepo.deleteById(productId);
        return productId + " deleted";
    }
}
