package com.company;

public interface UserService {
    boolean addUser(String name, String surname);

    boolean removeUser(long id);

    User getUser(long id);
}
