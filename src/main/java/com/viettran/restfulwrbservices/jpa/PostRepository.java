package com.viettran.restfulwrbservices.jpa;

import com.viettran.restfulwrbservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
