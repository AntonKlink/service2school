package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.business.offer.dto.OfferDto;
import ee.service2school.business.offer.dto.OfferRequestDto;
import ee.service2school.business.offer.dto.OfferResponseDto;
import ee.service2school.domain.form.city.City;
import ee.service2school.domain.form.city.CityService;
import ee.service2school.domain.offer.*;
import ee.service2school.domain.user.User;
import ee.service2school.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class OfferHomeService {

    @Resource
    private OfferMapper offerMapper;

    @Resource
    private OfferService offerService;

    @Resource
    private UserService userService;
    @Resource
    private CityService cityService;


    public List<OfferDto> getOffers() {
        List<Offer> offers = offerService.getLastFiveOffers();
        List<OfferDto> offerDtos = offerMapper.toDtos(offers);
        return offerDtos;
    }


    public OfferDetailDto getDetailOfferByOfferId(Integer offerId) {
        Offer offer = offerService.findOfferByOfferId(offerId);
        OfferDetailDto offerDetailDto = offerMapper.toDetailDto(offer);
        return offerDetailDto;
    }


    public OfferResponseDto addOffer(OfferRequestDto requestDto) {
        /// Meelespea, alati tegeleme foreignKey-dega kõigepealt
        Integer userId = requestDto.getUserId();

        // peame leidma ülesse nende objektid andmebaasisd
        User user = userService.getUserByUserId(userId);

        Integer cityId = requestDto.getCityId();
        City city = cityService.getCityByCityId(cityId);


        Offer offer = offerMapper.toOffer(requestDto);
        offer.setCity(city);
        offer.setUser(user);
        offer.setDateAdd(LocalDate.now());
        offerService.saveOffer(offer);
        OfferResponseDto responseDto = new OfferResponseDto();
        responseDto.setOfferId(offer.getId());
        return responseDto;
    }
}
