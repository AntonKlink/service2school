package ee.service2school.business.offer.dto;

import ee.service2school.domain.offer.Offer;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Offer} entity
 */
@Data
public class OfferDetailDto implements Serializable {
//    @NotNull
//    private String email;
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
    @NotNull
    private LocalDate dateAdd;
    @Size(max = 255)
    private String additionalInfo;
    @Size(max = 1)
    @NotNull
    private final String status;
}