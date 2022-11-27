package ee.service2school.form.subject;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-27T19:43:52+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class SubjectMapperImpl implements SubjectMapper {

    @Override
    public SubjectDto toDto(Subject subject) {
        if ( subject == null ) {
            return null;
        }

        Integer subjectId = null;
        String subjectName = null;

        subjectId = subject.getId();
        subjectName = subject.getName();

        SubjectDto subjectDto = new SubjectDto( subjectId, subjectName );

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
