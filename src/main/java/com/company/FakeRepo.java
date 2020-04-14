package com.company;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;


@Repository("fakeRepo")
public class FakeRepo implements FakeRepoInterface {

   private final ArrayList<User> database = new ArrayList<>();

    @Override
    public int insertUser(long id, String name, String surname) {
        database.add(new User(id, name, surname));
        return 1;
    }

    @Override
    public Optional<User> findUserById(long id) {
        return database.stream().filter(user -> user.getId() == id).findFirst();
    }

    @Override
    public boolean deleteUserById(long id) {
        Optional<User> personToDelete = findUserById(id);
        if (personToDelete.isEmpty()) {
            return false;
        } else {
            database.remove(personToDelete.get());
            return true;
        }


    }
}
