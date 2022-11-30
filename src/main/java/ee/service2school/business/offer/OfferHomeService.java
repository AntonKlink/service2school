package ee.service2school.business.offer;

import ee.service2school.domain.offer.Offer;
import ee.service2school.domain.offer.OfferDto;
import ee.service2school.domain.offer.OfferHomeMapper;
import ee.service2school.domain.offer.OfferRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OfferHomeService {

    @Resource
    public OfferHomeMapper offerHomeMapper;
    @Resource
    public OfferRepository offerRepository;

    public List<OfferDto> getNameDescription() {
        List<Offer> firstTwoEntities = offerRepository.findAll();
        List<OfferDto> allDtos = offerHomeMapper.toDtos(firstTwoEntities);
        return allDtos;
    }
}
