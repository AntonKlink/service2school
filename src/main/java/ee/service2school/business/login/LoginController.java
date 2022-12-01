package ee.service2school.business.login;

import ee.service2school.domain.contact.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private LoginService loginService;



    @GetMapping("/login")
    public LoginResponse login(@RequestParam String email, @RequestParam String password) {
        LoginResponse loginResponse = loginService.login(email, password);
        return loginResponse;

    }

    @GetMapping("/profile")
    public ContactDto getProfileInfo(Integer userId) {
        ContactDto profileInfo = loginService.getProfileInfo(userId);
        return profileInfo;
    }

    @PostMapping("/profile")
    public void addNewUser(@RequestBody UserRequest request) {

    }
}



