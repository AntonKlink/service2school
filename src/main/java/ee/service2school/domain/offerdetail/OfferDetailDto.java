package ee.service2school.domain.offerdetail;

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
    private final Integer offerDetailId;
    private final Integer offerDetailUserOfferDetailUserId;
    @Size(max = 255)
    @NotNull
    private final String offerDetailUserOfferDetailUserEmail;
    @Size(max = 255)
    @NotNull
    private final String offerDetailName;
    @Size(max = 4096)
    @NotNull
    private final String offerDetailDescription;
    @NotNull
    private final Integer offerDetailPricePerStudent;
    @NotNull
    private final Integer offerDetailStudentsMin;
    @NotNull
    private final Integer offerDetailStudentsMax;
    private final Integer offerDetailCityOfferDetailCityId;
    @Size(max = 50)
    @NotNull
    private final String offerDetailCityOfferDetailCityName;
    @Size(max = 255)
    @NotNull
    private final String offerDetailAddress;
    @NotNull
    private final Integer offerDetailPhone;
    @NotNull
    private final LocalDate offerDetailDateAdd;
    @Size(max = 255)
    private final String offerDetailAdditionalInfo;
}