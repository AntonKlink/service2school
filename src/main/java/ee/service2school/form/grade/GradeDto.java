package ee.service2school.form.grade;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A DTO for the {@link Grade} entity
 */
@Data
public class GradeDto implements Serializable {
    private final Integer gradeId;
    @NotNull
    private final Integer gradeNumber;
}