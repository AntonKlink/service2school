package ee.service2school.domain.offer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OfferService {

    @Resource
    private OfferRepository offerRepository;


    public List<Offer> getLastFiveOffers() {
        List<Offer> offers = offerRepository.findTop5ByOrderByDateAddDescNameAsc();
        return offers;
    }
}
