package ee.service2school.business.offer;

import ee.service2school.domain.offer.OfferDto;
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

    @GetMapping("")
    @Operation(summary = "Selle teenusega saad Home vaatesse 5 viimast pakkumist koos kirjeldusega")
    public List<OfferDto> getOffers() {
        List<OfferDto> result = offerHomeService.getOffers();
        return result;
    }

}
