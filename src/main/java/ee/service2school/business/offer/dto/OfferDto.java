package ee.service2school.business.offer.dto;

import ee.service2school.domain.offer.Offer;
import lombok.Data;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Offer} entity
 */
@Data
public class OfferDto implements Serializable {
    private final Integer offerId;
    @Size(max = 255)
    @NotNull
    private final String offerName;
    @Size(max = 4096)
    @NotNull
    private final String offerDescription;
}