package dev.learning.freeTesting.userAuth;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAuthRepository extends MongoRepository<User, String> {

}
