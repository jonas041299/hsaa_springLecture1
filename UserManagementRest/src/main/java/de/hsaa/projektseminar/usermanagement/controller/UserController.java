/*package de.hsaa.projektseminar.usermanagement.controller;

import de.hsaa.projektseminar.usermanagement.model.Product;
import de.hsaa.projektseminar.usermanagement.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserLoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {

        Optional<Product> user = loginService.login(username, password);

        if (user.isPresent()) {
            return new ResponseEntity<>(String.format("Welcome %s!", user.get().getGivenName()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No User found or invalid password", HttpStatus.BAD_REQUEST);
        }
    }

}*/
