package com.company;

public interface UserService {
    boolean addUser(String name, String surname);

   default boolean addUser(long id, String name, String surname){
       return addUser(id,name,surname);
   }

    boolean removeUser(long id);

    User getUser(long id);
}
