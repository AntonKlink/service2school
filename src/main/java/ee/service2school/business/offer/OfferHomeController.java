package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.*;
import ee.service2school.domain.offer.Offer;
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

    @GetMapping("/about")
    @Operation(summary = "Selle teenusega saad Teenused vaatesse 100 viimast pakkumist koos kirjeldusega")
    public List<OfferDto> getAllOffers() {
        List<OfferDto> result = offerHomeService.getAllOffers();
        return result;
    }

    @GetMapping("/detail")
    @Operation(summary = "Siia tuleb esilehel klikitud teenuse detailne vaade kasutades offerId'd")
    public OfferDetailDto getDetailOfferByOfferId(@RequestParam Integer offerId) {
        OfferDetailDto result = offerHomeService.getDetailOfferByOfferId(offerId);
        return result;
    }

    @GetMapping("/user-offers")
    @Operation(summary = "See teenus kuvab ainult konkreetse kasutaja poolt lisatud teenused")
    public List<OfferDto> getUserOffers(@RequestParam Integer userId) {
        List<OfferDto> activeOffersByUser = offerHomeService.getActiveOffersByUser(userId);
        return activeOffersByUser;
    }

    @PostMapping("/offer")
    @Operation(summary = "Offeri lisamine Stage1")
    public OfferResponseDto addOffer(@RequestBody OfferRequestDto requestDto) {

        OfferResponseDto offerResponseDto = offerHomeService.addOffer(requestDto);
        return offerResponseDto;
    }

    @PostMapping("/offer/grade/subject")
    @Operation(summary = "Klasside ja ainete lisamine pakkumisele")
    public void addGradeSubjectToOffer(@RequestBody GradeSubjectRequestDto dto) {
        offerHomeService.addGradeSubjectToOffer(dto);
    }

    @PutMapping("/change-offer")
    @Operation(summary = "Muuda pakkumise info")
    public void updateOffer(@RequestParam Integer offerId, @RequestBody OfferUpdate request) {
        offerHomeService.updateOffer(offerId, request);
    }

    @DeleteMapping("/delete-offer")
    @Operation(summary = "Selle teenusega saab 'kustutada' teenuse ehk muuta offerId põhjal offer tabelis status väli")
    public void deleteOffer(@RequestParam Integer offerId) {
        offerHomeService.deleteOffer(offerId);
    }
}



