package com.company;

import java.util.Optional;
import java.util.Random;

public interface FakeRepoInterface {

    int insertUser(long id, String name, String surname);

    default int insertUser(String name, String surname){
        Random random = new Random();
        long id = random.nextLong();
        return insertUser(id,name, surname);
    }

    Optional<User> findUserById(long id);

    boolean deleteUserById(long id);
}
