package com.hebertwellington.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hebertwellington.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
