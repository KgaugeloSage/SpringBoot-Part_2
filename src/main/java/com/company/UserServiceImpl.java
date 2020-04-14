package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private FakeRepo fakeRepo;

    @Autowired
    public UserServiceImpl(@Qualifier("fakeRepo") FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    public UserServiceImpl(){}



    @Override
    public boolean addUser(String name, String surname) {
        fakeRepo.insertUser(name,surname);
        System.out.println(name +" Entered");
        return true;
    }

    @Override
    public boolean removeUser(long id) {

        if (fakeRepo.findUserById(id).isPresent()){
            fakeRepo.deleteUserById(id);
            String name =  fakeRepo.findUserById(id).get().getName();
            System.out.println(name+" Removed");
            return true;
        }else{
            System.out.println("User with id: "+id+" does not exist");
            return false;
        }

    }

    @Override
    public User getUser(long id) {
       if (fakeRepo.findUserById(id).isPresent()){
          String name =  fakeRepo.findUserById(id).get().getName();
          System.out.println("Hello "+name);
          return fakeRepo.findUserById(id).get();
        }else{
           System.out.println("User with id: "+id+" does not exist");
           return null;
       }
    }
}
