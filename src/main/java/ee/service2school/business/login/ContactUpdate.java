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
    private final String contactFirstName;
    @Size(max = 255)
    @NotNull
    private final String contactLastName;
    @Size(max = 255)
    @NotNull
    private final String contactPhone;
    @Size(max = 255)
    @NotNull
    private final String contactInstitution;

}