package ee.service2school.business.login;

import ee.service2school.domain.contact.*;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Uue konto loomine - email ja parool")
    public LoginResponse addNewUser(@RequestBody UserRequest request) {
        LoginResponse response = loginService.addNewUser(request);
        return response;
    }

    @PostMapping("/contact")
    @Operation(summary = "Kontakt andmete lisamne (Eesnimi,Perekonnanimi,Asutuse nimi,Kontakttelefon)")
    public LoginResponse addNewContact(@RequestBody ContactRequest request) {
        LoginResponse response = loginService.addNewContact(request);
        return response;
    }


}



