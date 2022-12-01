package ee.service2school.business.login;

import lombok.Data;

@Data
public class UserRequest {
    private String email;
    private String password;
}
