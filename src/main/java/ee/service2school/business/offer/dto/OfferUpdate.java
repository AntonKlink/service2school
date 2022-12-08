package ee.service2school.business.offer.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link ee.service2school.domain.offer.Offer} entity
 */
@Data
public class OfferUpdate implements Serializable {
    @Size(max = 255)
    @NotNull
    private final String name;
    @Size(max = 4096)
    @NotNull
    private final String description;
    @NotNull
    private final Integer pricePerStudent;
    @NotNull
    private final Integer studentsMin;
    @NotNull
    private final Integer studentsMax;
    private final Integer cityId;
    @Size(max = 50)
    @NotNull
    private final String cityName;
    @Size(max = 255)
    @NotNull
    private final String address;
    @NotNull
    private final Integer phone;
    @NotNull
    private final LocalDate dateAdd;
    @Size(max = 255)
    private final String additionalInfo;
//    private final byte[] picture;
}