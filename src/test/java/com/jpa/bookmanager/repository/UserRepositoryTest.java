package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
        Page<User> users = userRepository.findAll(PageRequest.of(0, 3));

        System.out.println("page : " + users);
        System.out.println("totalElements : " + users.getTotalElements());
        System.out.println("totalPages : " + users.getTotalPages());
        System.out.println("numberOfElements : " + users.getNumberOfElements());
        System.out.println("sort : " + users.getSort());
        System.out.println("size : " + users.getSize());

        users.getContent().forEach(System.out::println);
    }
}