package ee.service2school.login;

import ee.service2school.domain.user.User;
import ee.service2school.domain.user.UserMapper;
import ee.service2school.domain.user.UserRepository;
import ee.service2school.domain.user.UserService;
import ee.service2school.infrastructure.exception.BusinessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class LoginService {

    @Resource
    private UserMapper userMapper;
    
    @Resource
    private UserService userService;

    public LoginResponse login(String email, String password) {
        User user = userService.getValidUser(email, password);
        LoginResponse loginResponse = userMapper.toLoginResponse(user);
        return loginResponse;
    }
}
