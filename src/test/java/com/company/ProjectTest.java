package com.company;

import  org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.TestComponent;
import static org.junit.jupiter.api.Assertions.*;


@TestComponent
public class ProjectTest {

   private final UserServiceImpl userService = new UserServiceImpl();

//    @Autowired
//    ProjectTest( UserServiceImpl userService){
//        this.userService = userService;
//    }

    @Test
    void addUserTest(){
       // assertTrue(userService.addUser("Kagugelo", "Ramaramela"));
        userService.addUser("Kagugelo", "Ramaramela");
    }

    @Test
    void  removeUserTest(){
        long id = 12456756L;
        assertTrue(userService.removeUser(id));
    }

    @Test
    void getUserTest(){
        long id = 1234565657L;
        String name = "Kgaugelo";
        String surname = "Ramaramela";
        assertEquals(new User(id,name,surname),userService.getUser(id));
    }
}
