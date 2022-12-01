package ee.service2school.domain.offerdetail;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.domain.offer.Offer;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfferDetailMapper {
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
    OfferDetailDto toDetailDto(Offer offer);

    @InheritInverseConfiguration(name = "updateOfferFromOfferDetailDto")
    OfferDetailDto offerToOfferDetailDto(Offer offer);

    @InheritConfiguration(name = "offerDetailDtoToOffer")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Offer updateOfferFromOfferDetailDto(OfferDetailDto offerDetailDto, @MappingTarget Offer offer);
}
