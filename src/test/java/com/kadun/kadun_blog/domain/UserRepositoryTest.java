package com.kadun.kadun_blog.domain;

import com.kadun.kadun_blog.model.Role;
import com.kadun.kadun_blog.model.User;
import com.kadun.kadun_blog.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest{

    @Autowired
    private UserRepository userRepository;

    @Test
    public void 유저생성() {
        User user = User.builder()
                .name("테스트유저")
                .email("test@naver.com")
                .password("1234")
                .role(Role.USER)
                .build();

        userRepository.save(user);
    }

}
