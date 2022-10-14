package usermanagement.repository;

import de.hsaa.projektseminar.usermanagement.model.User;
import de.hsaa.projektseminar.usermanagement.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveAndLoadAUser() {
        User testUser = new User();
        testUser.setUsername("u.altin");
        testUser.setPassword("1234");
        testUser.setGivenName("Ufuk Altin");
        User genericEntity = userRepository.save(testUser);
        Optional<User> foundEntity = userRepository
                .findById("u.altin");

        assertNotNull(foundEntity.isPresent());
        assertEquals(genericEntity, foundEntity.get());
    }

    @Test
    public void loadExistingUser() {
        Optional<User> byId = userRepository.findById("m.musterman");
        assertTrue(byId.isPresent());
    }
}