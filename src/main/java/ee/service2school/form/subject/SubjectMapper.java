package ee.service2school.form.subject;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SubjectMapper {
//    @Mapping(source = "subjectId", target = "id")
//    @Mapping(source = "subjectName", target = "name")
//    Subject subjectDtoToSubject(SubjectDto subjectDto);
//
//    @InheritInverseConfiguration(name = "subjectDtoToSubject")

    @Mapping(source = "id", target = "subjectId" )
    @Mapping(source = "name", target = "subjectName" )
    SubjectDto toDto(Subject subject);

    List<SubjectDto> toDtos(List<Subject> subjects);

//    @InheritConfiguration(name = "subjectDtoToSubject")
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Subject updateSubjectFromSubjectDto(SubjectDto subjectDto, @MappingTarget Subject subject);
}
