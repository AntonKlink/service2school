package ee.service2school.domain.offer;

import ee.service2school.business.offer.dto.OfferDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfferMapper {
    @Mapping(source = "id", target = "offerId")
    @Mapping(source = "name", target = "offerName")
    @Mapping(source = "description", target = "offerDescription")
    OfferDto toDto(Offer offer);

    List<OfferDto> toDtos(List<Offer> offers);


}
