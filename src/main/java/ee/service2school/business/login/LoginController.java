package ee.service2school.business.login;

import ee.service2school.domain.contact.*;
import ee.service2school.login.LoginResponse;
import ee.service2school.login.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private LoginService loginService;


    @Resource
    private ContactService contactService;

    @GetMapping("/login")
    public LoginResponse login(@RequestParam String email, @RequestParam String password) {
        LoginResponse loginResponse = loginService.login(email, password);
        return loginResponse;

    }

    @GetMapping("/profile")
    public ContactDto getProfileInfo(Integer userId) {
        ContactDto profileInfo = contactService.getProfileInfo(userId);
        return profileInfo;
    }
}



