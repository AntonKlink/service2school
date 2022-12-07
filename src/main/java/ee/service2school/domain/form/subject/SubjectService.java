package ee.service2school.domain.form.subject;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SubjectService {

    @Resource
    private SubjectRepository subjectRepository;


    public Subject findSubjectBySubjectId(Integer subjectId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        return subject;
    }

}
