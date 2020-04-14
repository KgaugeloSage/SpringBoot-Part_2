package com.company;

public class User {
    private long id;
    private String name;
    private String surname;

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
