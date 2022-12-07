package ee.service2school.domain.form.grade;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class GradeService {
    @Resource
    private GradeRepository gradeRepository;


    public Grade findGradeByGradeId(Integer gradeId) {
        Optional<Grade> optionalGrade = gradeRepository.findById(gradeId);
        Grade grade = optionalGrade.get();
        return grade;
    }
}
