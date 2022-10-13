package de.hsaa.projektseminar.usermanagement.db.repository;

import de.hsaa.projektseminar.usermanagement.db.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
