package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
        userRepository.save(new User("david", "david@naver.com"));

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("hojae-updated@naver.com");

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);
    }

    @Test
    void select(){
        System.out.println(userRepository.findByName("dennis"));

        System.out.println("findByEmail : " + userRepository.findByEmail("hojae@naver.com"));
        System.out.println("getByEmail : " + userRepository.getByEmail("hojae@naver.com"));
        System.out.println("readByEmail : " + userRepository.readByEmail("hojae@naver.com"));
        System.out.println("queryByEmail : " + userRepository.queryByEmail("hojae@naver.com"));
        System.out.println("searchByEmail : " + userRepository.searchByEmail("hojae@naver.com"));
        System.out.println("streamByEmail : " + userRepository.streamByEmail("hojae@naver.com"));
        System.out.println("findUserByEmail : " + userRepository.findUserByEmail("hojae@naver.com"));
        System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("hojae@naver.com"));

        System.out.println("findTop2ByName : " + userRepository.findTop2ByName("hojae"));
        System.out.println("findFirst1ByName : " + userRepository.findFirst1ByName("hojae"));
    }
}