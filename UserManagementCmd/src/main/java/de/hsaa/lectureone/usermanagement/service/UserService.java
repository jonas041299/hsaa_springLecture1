package de.hsaa.lectureone.usermanagement.service;

import de.hsaa.lectureone.usermanagement.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    Map<String, User> users = new HashMap<>();

    {
        User u = new User("abc","abc", "Ufuk");
        users.put(u.getLogin(), u);
    }

    public boolean loginInSuccess(String loginName, String password) {
        if (users.containsKey(loginName)) {
            return users.get(loginName).getPassword().equals(password);
        } else {
            return false;
        }
    }

    public User getUser(String loginName) {
        return users.get(loginName);
    }
}
