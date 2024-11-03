package dev.learning.freeTesting.userAuth;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "users")
public class User {
    @Id
    private ObjectId id;
    private String username;
    private Boolean active;
    private String email;
    private String password;
}
