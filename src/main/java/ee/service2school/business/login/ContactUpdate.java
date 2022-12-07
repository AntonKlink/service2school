package ee.service2school.business.login;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link ee.service2school.domain.contact.Contact} entity
 */
@Data
public class ContactUpdate implements Serializable {
    @Size(max = 255)
    @NotNull
    private final String firstName;
    @Size(max = 255)
    @NotNull
    private final String lastName;
    @Size(max = 255)
    @NotNull
    private final String phone;
    @Size(max = 255)
    @NotNull
    private final String institution;

}