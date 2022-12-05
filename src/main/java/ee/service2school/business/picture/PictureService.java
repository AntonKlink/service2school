package ee.service2school.business.picture;

import ee.service2school.domain.offer.Offer;
import ee.service2school.domain.offer.OfferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

@Service
public class PictureService {

    @Resource
    private OfferService offerService;
    public void addPicture(PictureDto request) {
        String pictureDataAsString = request.getPictureData();
        byte[] pictureDataAsBytes = pictureDataAsString.getBytes(StandardCharsets.UTF_8);
        Offer offer = offerService.findOfferByOfferId(request.getOfferId());
        offer.setPicture(pictureDataAsBytes);
        offer.setAdditionalInfo(request.getAdditionalInfo());
        offerService.saveOffer(offer);
    }
}
