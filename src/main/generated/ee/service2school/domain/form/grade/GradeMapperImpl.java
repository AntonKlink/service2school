package ee.service2school.domain.form.grade;

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
public class GradeMapperImpl implements GradeMapper {

    @Override
    public GradeDto toDto(Grade grade) {
        if ( grade == null ) {
            return null;
        }

        GradeDto gradeDto = new GradeDto();

        gradeDto.setGradeId( grade.getId() );
        gradeDto.setGradeNumber( grade.getNumber() );

        return gradeDto;
    }

    @Override
    public List<GradeDto> toDtos(List<Grade> grades) {
        if ( grades == null ) {
            return null;
        }

        List<GradeDto> list = new ArrayList<GradeDto>( grades.size() );
        for ( Grade grade : grades ) {
            list.add( toDto( grade ) );
        }

        return list;
    }
}
