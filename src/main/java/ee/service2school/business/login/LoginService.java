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

    public LoginResponse addNewUser(UserRequest request) {
        User user = userMapper.toEntity(request);
        userService.addNewUser(user);
        Integer userId = user.getId();
        LoginResponse response = new LoginResponse(userId);
        return response;

    }

    public LoginResponse addNewContact(ContactRequest request) {
        User user = userService.getUserByUserId(request.getUserId());
        Contact contact = contactMapper.toEntity(request);
        contact.setUser(user);
        contactService.addNewContact(contact);
        Integer contactId = contact.getId();
        LoginResponse response = new LoginResponse(contactId);
        return response;
    }
}
