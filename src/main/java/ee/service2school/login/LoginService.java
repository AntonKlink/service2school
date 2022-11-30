package ee.service2school.login;

import ee.service2school.domain.contact.Contact;
import ee.service2school.domain.contact.ContactMapper;
import ee.service2school.domain.contact.ContactRepository;
import ee.service2school.domain.user.User;
import ee.service2school.domain.user.UserMapper;
import ee.service2school.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    @Resource
    private UserMapper userMapper;
    
    @Resource
    private UserService userService;

    @Resource
    private ContactRepository contactRepository;

    @Resource
    private ContactMapper contactMapper;


    public LoginResponse login(String email, String password) {
        User user = userService.getValidUser(email, password);
        LoginResponse loginResponse = userMapper.toLoginResponse(user);
        return loginResponse;
    }


}
