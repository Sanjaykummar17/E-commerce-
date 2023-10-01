package com.sunday_test.EcommerceSundayTest.repo;

import com.sunday_test.EcommerceSundayTest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IUserRepo extends JpaRepository<User, Integer> {



}
