package de.hsaa.projektseminar.usermanagement.db;

import de.hsaa.projektseminar.usermanagement.model.User;
import de.hsaa.projektseminar.usermanagement.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserLoginService loginService;

    @Override
    public void run(String... args) throws Exception {
        if (args.length >= 3 && args[0].equalsIgnoreCase("login")) {
            Optional<User> user = loginService.login(args[1], args[2]);
            if (user.isPresent()) {
                System.out.printf("Hello %s!", user.get().getGivenName());
            } else {
                System.out.printf("No User found for login [%s]!", args[1]);
            }
        } else {
            System.err.println("No Arguments provided");
        }
    }
}
