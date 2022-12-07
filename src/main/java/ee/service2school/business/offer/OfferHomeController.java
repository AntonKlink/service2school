package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.*;
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

    @PostMapping("/offer/grade/subject")
    @Operation(summary = "klasside ja ainete lisamine pakkumisele")
    public void addGradeSubjectToOffer(@RequestBody GradeSubjectRequestDto dto) {
        offerHomeService.addGradeSubjectToOffer(dto);
    }

    @PutMapping("/change-offer")
    @Operation(summary = "muuta pakkumise info")
    public void updateOffer(@RequestParam Integer offerId, @RequestBody OfferUpdate request) {
        offerHomeService.updateOffer(offerId, request);
    }
}

// TODO: võta maha cityId ja e-mail DTO'st, et nad fronti ei läheks


