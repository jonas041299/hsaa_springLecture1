package de.hsaa.projektseminar.usermanagement.repository;

import de.hsaa.projektseminar.usermanagement.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
