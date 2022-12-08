package ee.service2school.domain.grade;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OfferGradeService {

    @Resource
    private OfferGradeRepository offerGradeRepository;

    public void addOfferGrade(OfferGrade offerGrade) {
        offerGradeRepository.save(offerGrade);
    }

}
