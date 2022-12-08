package ee.service2school.domain.offer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class OfferService {


    @Resource
    private OfferRepository offerRepository;


    public List<Offer> getLastFiveOffers() {
        List<Offer> offers = offerRepository.findTop5ByStatusOrderByDateAddDesc("A");
        return offers;
    }

    public List<Offer> getActiveOffersByUserId(Integer userId) {
        return offerRepository.findOffersByStatusAndUserId(userId, "A");
    }

    //TODO - see lõpuks viib profiili drop-downi
//    List<Offer> findUserActiveOffers(Integer userId, String status) {
//        return offerRepository.findOffersByStatusAndUserId(userId, "A");
//    }

    public List<Offer> getAllOffers() {
        List<Offer> offers = offerRepository.findTop100ByOrderByDateAddDescNameAsc();
        return offers;
    }

    public Offer findOfferByOfferId(Integer offerId) {
        Optional<Offer> offerOptional = offerRepository.findById(offerId);
        Offer offer = offerOptional.get();

        // Võimalus ka paberi seeest kohe komm kätte saada (ühe reaga
        // Offer offer = offerRepository.findById(offerId).get();

        // one liner solution
        // return offerRepository.findById(offerId).get();

        return offer;
    }

    public void saveOffer(Offer offer) {
        offerRepository.save(offer);
    }

    public void save(Offer offer) {
        offerRepository.save(offer);
    }


}
