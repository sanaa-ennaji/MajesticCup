package org.sanaa.brif10.majesticcup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    List<User> findByRole(String role);
}
