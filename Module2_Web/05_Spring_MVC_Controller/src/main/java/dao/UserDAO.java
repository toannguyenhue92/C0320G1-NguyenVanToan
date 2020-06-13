package dao;

import models.Login;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("toan", "123456", "toan", "toan@gmail.com", 28));
        users.add(new User("an", "123456", "an", "an@gmail.com", 28));
        users.add(new User("long", "123456", "long", "long@gmail.com", 28));
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
