package ee.service2school.domain.grade;

import ee.service2school.business.offer.dto.OfferGradeRequestDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfferGradeMapper {
    @Mapping(source = "offerId", target = "offer.id")
    @Mapping(source = "gradeId", target = "grade.id")
    @Mapping(source = "gradeNumber", target = "grade.number")
    OfferGrade offerGradeRequestDtoToOfferGrade(OfferGradeRequestDto offerGradeRequestDto);

    @InheritInverseConfiguration(name = "offerGradeRequestDtoToOfferGrade")
    OfferGradeRequestDto offerGradeToOfferGradeRequestDto(OfferGrade offerGrade);

    @InheritConfiguration(name = "offerGradeRequestDtoToOfferGrade")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OfferGrade updateOfferGradeFromOfferGradeRequestDto(OfferGradeRequestDto offerGradeRequestDto, @MappingTarget OfferGrade offerGrade);
}
