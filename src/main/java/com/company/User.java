package com.company;

/**
 * User Model with it's attributes
 */
public class User {
    private final long id;
    private final String name;
    private final String surname;

    /**
     * User constructor to set the attributes
     * @param id
     * @param name
     * @param surname
     */
    User(long id, String name , String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
