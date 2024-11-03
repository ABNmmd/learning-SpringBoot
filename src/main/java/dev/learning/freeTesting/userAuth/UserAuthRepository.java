package dev.learning.freeTesting.userAuth;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthRepository extends MongoRepository<User, String> {

}
