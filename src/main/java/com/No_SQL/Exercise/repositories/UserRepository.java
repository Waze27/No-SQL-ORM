package com.No_SQL.Exercise.repositories;

import com.No_SQL.Exercise.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
