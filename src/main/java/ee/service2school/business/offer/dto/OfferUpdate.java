package ee.service2school.business.offer.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link ee.service2school.domain.offer.Offer} entity
 */
@Data
public class OfferUpdate implements Serializable {
    @Size(max = 255)
    @NotNull
    private String name;
    @Size(max = 4096)
    @NotNull
    private String description;
    @NotNull
    private Integer pricePerStudent;
    @NotNull
    private Integer studentsMin;
    @NotNull
    private Integer studentsMax;
    private Integer cityId;
    @Size(max = 50)
    @NotNull
    private String cityName;
    @Size(max = 255)
    @NotNull
    private String address;
    @NotNull
    private Integer phone;
    @Size(max = 255)
    private String additionalInfo;
}