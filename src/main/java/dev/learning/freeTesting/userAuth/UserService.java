package dev.learning.freeTesting.userAuth;

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
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        return userRepository.save(newUser);
    }

    public User Login() {
    }

    public String Logout() {

    }
}
