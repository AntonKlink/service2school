package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.domain.offer.Offer;
import ee.service2school.domain.offer.OfferMapper;
import ee.service2school.domain.offer.OfferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OfferDetailService {

    @Resource
    private OfferService offerService;

    @Resource
    private OfferMapper offerMapper;

    public OfferDetailDto getDetailOfferByOfferId(Integer offerId) {
        Offer offer = offerService.findOfferByOfferId(offerId);
        OfferDetailDto offerDetailDto = offerMapper.toDetailDto(offer);
        return offerDetailDto;
    }

}

