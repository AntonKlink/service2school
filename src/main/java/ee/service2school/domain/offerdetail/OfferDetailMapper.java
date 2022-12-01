package ee.service2school.domain.offerdetail;

import ee.service2school.domain.offer.Offer;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfferDetailMapper {
    @Mapping(source = "offerDetailId", target = "id")
    @Mapping(source = "offerDetailUserOfferDetailUserId", target = "user.id")
    @Mapping(source = "offerDetailUserOfferDetailUserEmail", target = "user.email")
    @Mapping(source = "offerDetailName", target = "name")
    @Mapping(source = "offerDetailDescription", target = "description")
    @Mapping(source = "offerDetailPricePerStudent", target = "pricePerStudent")
    @Mapping(source = "offerDetailStudentsMin", target = "studentsMin")
    @Mapping(source = "offerDetailStudentsMax", target = "studentsMax")
    @Mapping(source = "offerDetailCityOfferDetailCityId", target = "city.id")
    @Mapping(source = "offerDetailCityOfferDetailCityName", target = "city.name")
    @Mapping(source = "offerDetailAddress", target = "address")
    @Mapping(source = "offerDetailPhone", target = "phone")
    @Mapping(source = "offerDetailDateAdd", target = "dateAdd")
    @Mapping(source = "offerDetailAdditionalInfo", target = "additionalInfo")
    Offer offerDetailDtoToOffer(OfferDetailDto offerDetailDto);

    @InheritInverseConfiguration(name = "offerDetailDtoToOffer")
    OfferDetailDto offerToOfferDetailDto(Offer offer);

    @InheritConfiguration(name = "offerDetailDtoToOffer")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Offer updateOfferFromOfferDetailDto(OfferDetailDto offerDetailDto, @MappingTarget Offer offer);
}
