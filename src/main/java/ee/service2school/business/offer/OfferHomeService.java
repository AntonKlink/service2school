package ee.service2school.business.offer;

import ee.service2school.domain.offer.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OfferHomeService {

    @Resource
    public OfferHomeMapper offerHomeMapper;
    @Resource
    public OfferService offerService;

    public List<OfferDto> getOffers() {
        List<Offer> offers = offerService.getLastFiveOffers();
        List<OfferDto> offerDtos = offerHomeMapper.toDtos(offers);
        return offerDtos;
    }
}
