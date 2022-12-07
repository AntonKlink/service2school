package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.business.offer.dto.OfferDto;
import ee.service2school.business.offer.dto.OfferRequestDto;
import ee.service2school.business.offer.dto.OfferResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/home")
public class OfferHomeController {

    @Resource
    public OfferHomeService offerHomeService;

    @GetMapping("")
    @Operation(summary = "Selle teenusega saad Home vaatesse 5 viimast pakkumist koos kirjeldusega")
    public List<OfferDto> getOffers() {
        List<OfferDto> result = offerHomeService.getOffers();
        return result;
    }

    @GetMapping("/detail")
    @Operation(summary = "Siia tuleb esilehel klikitud teenuse detailne vaade kasutades offerId'd")
    public OfferDetailDto getDetailOfferByOfferId(@RequestParam Integer offerId) {
        OfferDetailDto result = offerHomeService.getDetailOfferByOfferId(offerId);
        return result;
    }
    @PostMapping("/offer")
    @Operation(summary = "Offeri lisamine Stage1")
    public OfferResponseDto addOffer(@RequestBody OfferRequestDto requestDto) {

        OfferResponseDto offerResponseDto = offerHomeService.addOffer(requestDto);
        return offerResponseDto;
    }

}



