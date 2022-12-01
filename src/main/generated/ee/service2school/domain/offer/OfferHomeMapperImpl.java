package ee.service2school.domain.offer;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-01T13:44:38+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class OfferHomeMapperImpl implements OfferHomeMapper {

    @Override
    public OfferDto toDto(Offer offer) {
        if ( offer == null ) {
            return null;
        }

        Integer offerId = null;
        String offerName = null;
        String offerDescription = null;

        offerId = offer.getId();
        offerName = offer.getName();
        offerDescription = offer.getDescription();

        OfferDto offerDto = new OfferDto( offerId, offerName, offerDescription );

        return offerDto;
    }

    @Override
    public List<OfferDto> toDtos(List<Offer> offers) {
        if ( offers == null ) {
            return null;
        }

        List<OfferDto> list = new ArrayList<OfferDto>( offers.size() );
        for ( Offer offer : offers ) {
            list.add( toDto( offer ) );
        }

        return list;
    }
}
