package ee.service2school.domain.user;

import ee.service2school.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    public User getValidUser(String email, String password) {
//        Optional<User> userOptional = userRepository.findBy(email, password);
        Optional<User> userOptional = userRepository.findBy(email, password);

        Validation.validateCorrectCredentials(userOptional);

        User user = userOptional.get();
        return user;

    }


    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public User getUserByUserId(Integer userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.get();
        return user;
    }
}
