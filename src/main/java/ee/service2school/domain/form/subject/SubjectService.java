package ee.service2school.domain.form.subject;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class SubjectService {

    @Resource
    private SubjectRepository subjectRepository;


    public Subject findSubjectBySubjectId(Integer subjectId) {
        Optional<Subject> optionalSubject = subjectRepository.findById(subjectId);
        Subject subject = optionalSubject.get();
        return subject;
    }
}
