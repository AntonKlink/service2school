package ee.service2school.form.subject;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Subject} entity
 */
@Data
public class SubjectDto implements Serializable {
    private final Integer subjectId;
    @Size(max = 50)
    @NotNull
    private final String subjectName;
}