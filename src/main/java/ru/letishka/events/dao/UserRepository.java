package ru.letishka.events.dao;

import org.springframework.data.repository.CrudRepository;
import ru.letishka.events.dto.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();
}
