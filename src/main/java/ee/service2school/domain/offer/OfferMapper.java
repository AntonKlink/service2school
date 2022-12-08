package ee.service2school.domain.offer;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.business.offer.dto.OfferDto;
import ee.service2school.business.offer.dto.OfferRequestDto;
import ee.service2school.business.offer.dto.OfferUpdate;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfferMapper {
    @Mapping(source = "id", target = "offerId")
    @Mapping(source = "name", target = "offerName")
    @Mapping(source = "description", target = "offerDescription")
    OfferDto toDto(Offer offer);

    List<OfferDto> toDtos(List<Offer> offers);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "pricePerStudent", source = "pricePerStudent")
    @Mapping(target = "studentsMin", source = "studentsMin")
    @Mapping(target = "studentsMax", source = "studentsMax")
    @Mapping(target = "cityId", source = "city.id")
    @Mapping(target = "cityName", source = "city.name")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "dateAdd", source = "dateAdd")
    @Mapping(target = "additionalInfo", source = "additionalInfo")
    @Mapping(target = "status", source = "status")
    OfferDetailDto toDetailDto(Offer offer);

    Offer toOffer(OfferRequestDto requestDto);


    void updateOffer(OfferUpdate offerUpdate,@MappingTarget Offer offer);

}
