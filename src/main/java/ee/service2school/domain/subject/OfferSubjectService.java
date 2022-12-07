package ee.service2school.domain.subject;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OfferSubjectService {

    @Resource
    private OfferSubjectRepository offerSubjectRepository;

    public void addOfferSubject(OfferSubject offerSubject) {
        offerSubjectRepository.save(offerSubject);
    }
}
