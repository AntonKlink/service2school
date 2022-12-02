package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.domain.offer.Offer;
import ee.service2school.domain.offerdetail.OfferDetailMapper;
import ee.service2school.domain.offerdetail.OfferDetailRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OfferDetailService {

    @Resource
    public OfferDetailMapper offerDetailMapper;

    @Resource
    public OfferDetailService offerDetailService;

    @Resource
    public OfferDetailRepository offerDetailRepository;

    public List<OfferDetailDto> getDetailOffers() {
        List<Offer> offers = offerDetailRepository.findAll();
        List<OfferDetailDto> offerDetailDtos = offerDetailService(offers);
        return offerDetailDtos;
    }

}

