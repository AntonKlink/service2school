package ee.service2school.business.offer.dto;

import ee.service2school.domain.subject.OfferSubject;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link OfferSubject} entity
 */
@Data
public class OfferSubjectRequestDto implements Serializable {
    private final Integer id;
    private final Integer offerId;
    private final Integer subjectId;
    @Size(max = 50)
    @NotNull
    private final String subjectName;
}