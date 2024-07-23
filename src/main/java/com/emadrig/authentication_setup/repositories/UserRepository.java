package com.emadrig.authentication_setup.repositories;

import com.emadrig.authentication_setup.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
