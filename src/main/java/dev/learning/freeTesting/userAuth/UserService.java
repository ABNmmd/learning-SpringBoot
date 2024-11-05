package dev.learning.freeTesting.userAuth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserAuthRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User Register(User newUser) {
        
    }

    public User Login() {
    }

    public String Logout() {

    }
}
