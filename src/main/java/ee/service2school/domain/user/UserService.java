package ee.service2school.domain.user;

import ee.service2school.infrastructure.exception.BusinessException;
import ee.service2school.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    public UserRepository userRepository;

    public User getValidUser(String email, String password) {
//        Optional<User> userOptional = userRepository.findBy(email, password);
        Optional<User> userOptional = userRepository.findBy(email, password);

        Validation.validateCorrectCredentials(userOptional);

        User user = userOptional.get();
        return user;

    }


}
