package usermanagement.controller;

import de.hsaa.projektseminar.usermanagement.controller.UserController;
import de.hsaa.projektseminar.usermanagement.service.UserLoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class UserControllerUnitTest {


    @Mock
    private UserLoginService loginService;

    @InjectMocks
    private UserController userController;

    @Test
    void login() throws Exception {

        Mockito.when(loginService.login("m.musterman", "1234")).thenReturn(Optional.empty());

        ResponseEntity<String> result = userController.login("m.musterman", "1234");

        Assertions.assertEquals(HttpStatus.BAD_REQUEST ,result.getStatusCode());
    }
}