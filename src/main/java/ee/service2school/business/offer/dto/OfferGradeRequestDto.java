package ee.service2school.business.offer.dto;

import ee.service2school.domain.grade.OfferGrade;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A DTO for the {@link OfferGrade} entity
 */
@Data
public class OfferGradeRequestDto implements Serializable {
    private final Integer id;
    private final Integer offerId;
    private final Integer gradeId;
    @NotNull
    private final Integer gradeNumber;
}