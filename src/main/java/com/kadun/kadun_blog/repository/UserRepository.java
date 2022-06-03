package com.kadun.kadun_blog.repository;

import com.kadun.kadun_blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
