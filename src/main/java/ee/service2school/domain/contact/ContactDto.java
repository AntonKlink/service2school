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
    private  String firstName;
    @Size(max = 255)
    @NotNull
    private String lastName;
    @Size(max = 255)
    @NotNull
    private String phone;
    @Size(max = 255)
    @NotNull
    private String institution;
}