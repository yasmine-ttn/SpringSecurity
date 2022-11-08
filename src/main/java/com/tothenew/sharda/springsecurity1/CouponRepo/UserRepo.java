package com.tothenew.sharda.springsecurity1.CouponRepo;

import com.tothenew.sharda.springsecurity1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmail(String email);


}
