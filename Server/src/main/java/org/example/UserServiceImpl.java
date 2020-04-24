package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 *@author jahom
 *@date 2020/4/23 17:32
 */
public class UserServiceImpl implements IUserService {

    ArrayList<User> users = new ArrayList<User>();

    public UserServiceImpl() {
        User u1 = new User();
        u1.setId(1);
        u1.setAge(11);
        u1.setName("一一");

        User u2 = new User();
        u2.setId(2);
        u2.setAge(22);
        u2.setName("二二");

        users.add(u1);
        users.add(u2);
    }

    @Override
    public User GetUserById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().get();
    }
}
