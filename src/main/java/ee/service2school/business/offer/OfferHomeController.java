package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.business.offer.dto.OfferDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/home")
public class OfferHomeController {

    @Resource
    public OfferHomeService offerHomeService;

    @Resource
    OfferDetailService offerDetailService;

    @GetMapping("")
    @Operation(summary = "Selle teenusega saad Home vaatesse 5 viimast pakkumist koos kirjeldusega")
    public List<OfferDto> getOffers() {
        List<OfferDto> result = offerHomeService.getOffers();
        return result;
    }

    @GetMapping("/detail")
    @Operation(summary = "Siia tuleb esilehel klikitud teenuse detailne vaade kasutades offerId'd")
    public List<OfferDetailDto> getDetailOffers() {
        List<OfferDetailDto> result = offerDetailService.getDetailOffers();
        return result;
    }
}

// TODO: 01.12.2022 Siia tuleb getDetailInfo (offerId)


