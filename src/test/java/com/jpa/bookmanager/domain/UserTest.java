package com.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("gkqthd6386@naver.com");
        user.setName("hojae");

        User user1 = new User(null, "hojae", "gkqthd6386@naver.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("hojae", "gkqthd6386@naver.com");

        User.builder()
                .name("hojae")
                .email("gkqthd6386@naver.com")
                .build();

        System.out.println(">>> " + user);
    }
}