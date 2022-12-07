package ee.service2school.domain.subject;

import ee.service2school.business.offer.dto.OfferSubjectRequestDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfferSubjectMapper {
    @Mapping(source = "offerId", target = "offer.id")
    @Mapping(source = "subjectId", target = "subject.id")
    @Mapping(source = "subjectName", target = "subject.name")
    OfferSubject offerSubjectRequestDtoToOfferSubject(OfferSubjectRequestDto offerSubjectRequestDto);

    @InheritInverseConfiguration(name = "offerSubjectRequestDtoToOfferSubject")
    OfferSubjectRequestDto offerSubjectToOfferSubjectRequestDto(OfferSubject offerSubject);

    @InheritConfiguration(name = "offerSubjectRequestDtoToOfferSubject")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OfferSubject updateOfferSubjectFromOfferSubjectRequestDto(OfferSubjectRequestDto offerSubjectRequestDto, @MappingTarget OfferSubject offerSubject);
}
