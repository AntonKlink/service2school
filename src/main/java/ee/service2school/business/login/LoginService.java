package ee.service2school.business.login;

import ee.service2school.domain.contact.*;
import ee.service2school.domain.user.User;
import ee.service2school.domain.user.UserMapper;
import ee.service2school.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    private UserMapper userMapper;
    
    @Resource
    private UserService userService;

    @Resource
    private ContactMapper contactMapper;

    @Resource
    private ContactService contactService;

    public LoginResponse login(String email, String password) {
        User user = userService.getValidUser(email, password);
        LoginResponse loginResponse = userMapper.toLoginResponse(user);
        return loginResponse;
    }


    public ContactDto getProfileInfo(Integer userId) {
        Contact contact = contactService.findByUserId(userId);
        ContactDto contactDto = contactMapper.contactDto(contact);
        return contactDto;
    }
}
