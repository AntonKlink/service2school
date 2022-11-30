package ee.service2school.domain.contact;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Contact} entity
 */
@Data
public class ContactDto implements Serializable {
    private Integer contactId;
    @Size(max = 255)
    @NotNull
    private  String contactFirstName;
    @Size(max = 255)
    @NotNull
    private String contactLastName;
    @Size(max = 255)
    @NotNull
    private String contactPhone;
    @Size(max = 255)
    @NotNull
    private String contactInstitution;

}