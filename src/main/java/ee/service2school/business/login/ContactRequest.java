package ee.service2school.business.login;

import ee.service2school.domain.user.User;
import ee.service2school.domain.user.UserRepository;
import lombok.Data;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Optional;

/**
 * A DTO for the {@link ee.service2school.domain.contact.Contact} entity
 */
@Data
public class ContactRequest implements Serializable {


    private  String firstName;
    private  String lastName;
    private  String phone;
    private  String institution;
    private  Integer userId;
}