package com.company;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Optional;

/**
 * This is the repo class that does the functions with the database(Array)
 */
@Repository("fakeRepo")
public class FakeRepo implements FakeRepoInterface {

   private final ArrayList<User> database = new ArrayList<>();// The ArrayList that will act as a database in the project

    /**
     * This method adds the User in the database
     * @param id the ID of the User to be added in the Database
     * @param name Name of the User to be added in the Database
     * @param surname Surname of the User to be addws in the Database
     * @return
     */
    @Override
    public int insertUser(long id, String name, String surname) {
        database.add(new User(id, name, surname));
        return 1;
    }

    /**
     * searches for the User Object via the id returns the Object that matches the id
     * @param id used to find the Object of the User in the Database
     * @return returns the User Object found
     */
    @Override
    public Optional<User> findUserById(long id) {
        return database.stream().filter(user -> user.getId() == id).findFirst();
    }

    /**
     * finds User by Id then deletes the User object
     * @param id id of the user used to find User Object to delete
     * @return returns true if the delete was successful
     */
    @Override
    public boolean deleteUserById(long id) {
        Optional<User> personToDelete = findUserById(id);
        if (personToDelete.isPresent()) {
            return false;
        } else {
            database.remove(personToDelete.get());
            return true;
        }


    }
}
