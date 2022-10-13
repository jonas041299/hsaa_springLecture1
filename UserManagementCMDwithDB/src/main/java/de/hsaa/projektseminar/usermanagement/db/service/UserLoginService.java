package de.hsaa.projektseminar.usermanagement.db.service;

import de.hsaa.projektseminar.usermanagement.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class UserLoginService {

    Map<String, User> userDB = new HashMap<>();

    {
        User ufuk = new User("u.altin", "1234", "Ufuk Altin");
        userDB.put(ufuk.getUsername(), ufuk);
    }

    public Optional<User> login(String username, String password) {

        if (userDB.containsKey(username) && userDB.get(username).getPassword().equals(password)) {
            return Optional.of(userDB.get(username));
        }
        return Optional.empty();
    }

}
