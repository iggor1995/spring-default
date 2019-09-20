package service;

import entity.User;

public class UserService {

    public void save(User user) {
        System.out.println("Saved " + user.getName());
    }
}
