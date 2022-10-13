package de.hsaa.projektseminar.usermanagement.service;

import de.hsaa.projektseminar.usermanagement.model.User;
import de.hsaa.projektseminar.usermanagement.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserLoginServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserLoginService userLoginService;

    @Test
    public void testLoginNoUser() {
        String username = "user";
        String password = "password";
        Mockito.when(userRepository.findById(username)).thenReturn(Optional.empty());

        Optional<User> result = userLoginService.login(username, password);

        assertTrue(result.isEmpty());

        Mockito.verify(userRepository).findById(username);
    }

    @Test
    public void testLoginWrongPassword() {
        String username = "user";
        String password = "password";
        User user = new User();
        user.setUsername(username);
        user.setPassword("realPassword");
        user.setGivenName("givenName");
        Mockito.when(userRepository.findById(username)).thenReturn(Optional.of(user));

        Optional<User> result = userLoginService.login(username, password);

        assertTrue(result.isEmpty());
        Mockito.verify(userRepository).findById(username);
    }

    @Test
    public void testLoginCorrect() {
        String username = "user";
        String password = "realPassword";
        User user = new User();
        user.setUsername(username);
        user.setPassword("realPassword");
        user.setGivenName("givenName");
        Mockito.when(userRepository.findById(username)).thenReturn(Optional.of(user));

        Optional<User> result = userLoginService.login(username, password);

        assertTrue(result.isPresent());
        assertEquals(user, result.get());
        Mockito.verify(userRepository).findById(username);
    }

}