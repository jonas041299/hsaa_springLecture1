/*package de.hsaa.projektseminar.usermanagement.service;

import de.hsaa.projektseminar.usermanagement.model.Product;
import de.hsaa.projektseminar.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserLoginService {

    @Autowired
    private UserRepository userRepository;

    public Optional<Product> login(String username, String password) {

        Optional<Product> foundUser = userRepository.findById(username);
        if (foundUser.isPresent() && foundUser.get().getPassword().equals(password)) {
            return foundUser;
        }
        return Optional.empty();
    }

}*/
