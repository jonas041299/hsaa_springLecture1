package de.hsaa.lectureone.usermanagement;

import de.hsaa.lectureone.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {

        return new CommandLineRunner() {
            @Autowired
            private UserService service;

            @Override
            public void run(String... args) throws Exception {
                if (args.length >= 3 || args[0].equalsIgnoreCase("login")) {
                    if (service.loginInSuccess(args[1], args[2])) {
                        System.out.printf("Welcome %s!", service.getUser(args[1]).getName());
                    }
                } else
                    System.out.printf("No Arguments provided");
            }
        };
    }


}
