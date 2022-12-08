package ee.service2school.domain.form.subject;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-08T11:15:40+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class SubjectMapperImpl implements SubjectMapper {

    @Override
    public SubjectDto toDto(Subject subject) {
        if ( subject == null ) {
            return null;
        }

        SubjectDto subjectDto = new SubjectDto();

        subjectDto.setSubjectId( subject.getId() );
        subjectDto.setSubjectName( subject.getName() );

        return subjectDto;
    }

    @Override
    public List<SubjectDto> toDtos(List<Subject> subjects) {
        if ( subjects == null ) {
            return null;
        }

        List<SubjectDto> list = new ArrayList<SubjectDto>( subjects.size() );
        for ( Subject subject : subjects ) {
            list.add( toDto( subject ) );
        }

        return list;
    }
}
