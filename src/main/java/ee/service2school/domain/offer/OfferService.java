package ee.service2school.domain.offer;

import ee.service2school.domain.form.city.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class OfferService {

    @Resource
    private OfferRepository offerRepository;


    public List<Offer> getLastFiveOffers() {
        List<Offer> offers = offerRepository.findTop5ByOrderByDateAddDescNameAsc();
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

    public void addOffer(Offer offer) {
        offerRepository.save(offer);
    }
}
