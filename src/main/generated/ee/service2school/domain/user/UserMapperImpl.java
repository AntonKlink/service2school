package ee.service2school.domain.user;

import ee.service2school.business.login.LoginResponse;
import ee.service2school.business.login.UserRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-02T12:31:04+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public LoginResponse toLoginResponse(User user) {
        if ( user == null ) {
            return null;
        }

        LoginResponse loginResponse = new LoginResponse();

        loginResponse.setUserId( user.getId() );

        return loginResponse;
    }

    @Override
    public User toEntity(UserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );

        return user;
    }
}
