package ee.service2school.business.offer.dto;

import ee.service2school.domain.form.grade.GradeDto;
import ee.service2school.domain.form.subject.SubjectDto;
import lombok.Data;

import java.util.List;

@Data
public class GradeSubjectRequestDto {
    private Integer offerId;
    private List<GradeDto> grades;
    private List<SubjectDto> subjects;
}
