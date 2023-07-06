package com.viettran.restfulwrbservices.jpa;

import com.viettran.restfulwrbservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
