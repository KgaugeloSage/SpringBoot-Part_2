package com.company;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = Main.class)
public class ProjectTest {


    private final UserServiceImpl userService;

    @Autowired
    public ProjectTest(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Test
    void addUserTest() {
        long id = 123456789098L;
        assertTrue(userService.addUser(id, "Kagugelo", "Ramaramela"));
        userService.getUser(id);
    }

    @Test
    void removeUserTest() {
        long id = 1234567890985L;
        userService.addUser(id, "Lincoln", "MaRunAway");
        assertTrue(userService.removeUser(id));
    }

    @Test
    void getUserTest() {
        long id = 17695723657325735L;
        userService.addUser(id, "Bataung", "MaraT");
        String name = "Bataung";
        String surname = "MaraT";
        assertEquals(new User(id, name, surname).getId(), userService.getUser(id).getId());
    }
}
