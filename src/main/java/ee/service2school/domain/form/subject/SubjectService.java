package ee.service2school.domain.form.subject;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.security.auth.Subject;
import java.util.Optional;

@Service
public class SubjectService {

    @Resource
    private SubjectRepository subjectRepository;


    public Subject findSubjectBySubjectId(Integer subjectId) {
        Optional<ee.service2school.domain.form.subject.Subject> optionalSubject = subjectRepository.findById(subjectId);

        ee.service2school.domain.form.subject.Subject subject = optionalSubject.get();

        return null;
    }

}
