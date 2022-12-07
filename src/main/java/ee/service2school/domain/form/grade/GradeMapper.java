package ee.service2school.domain.form.grade;

import ee.service2school.domain.grade.OfferGrade;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GradeMapper {


    @Mapping(source = "id", target = "gradeId")
    @Mapping(source = "number", target = "gradeNumber")
    GradeDto toDto(Grade grade);


    List<GradeDto> toDtos(List<Grade> grades);

}
