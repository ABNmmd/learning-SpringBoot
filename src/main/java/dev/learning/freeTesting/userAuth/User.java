package dev.learning.freeTesting.userAuth;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "users")
public class User {
    private String username;
    private Boolean active;
    private String email;
    private String password;
}
