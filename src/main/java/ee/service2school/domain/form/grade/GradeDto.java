package ee.service2school.domain.form.grade;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A DTO for the {@link Grade} entity
 */
@Data
public class GradeDto implements Serializable {
    private Integer gradeId;
    @NotNull
    private Integer gradeNumber;

    private Boolean isSelected = false;
}