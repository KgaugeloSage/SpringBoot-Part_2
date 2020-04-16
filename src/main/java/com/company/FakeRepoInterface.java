package com.company;

import java.util.Optional;
import java.util.Random;

/**
 * the interface with methods to manipulate the User Objects in the database
 */
public interface FakeRepoInterface {

    /**
     * abstract method to insertUser to database
     * @param id attribute to add to the User when saving in the database
     * @param name attribute to add to the User when saving in the database
     * @param surname attribute to add to the User when saving in the database
     */
    int insertUser(long id, String name, String surname);

    /**
     * insert method overloaded to generate it's own random id
     */
    default int insertUser(String name, String surname){
        Random random = new Random();
        long id = random.nextLong();
        return insertUser(id,name, surname);
    }

    /**
     * abstract method to search for a User object in the database by id
     * @param id id used to search User Object
     * @return returns the Ubject when found
     */
    Optional<User> findUserById(long id);

    boolean deleteUserById(long id);
}
