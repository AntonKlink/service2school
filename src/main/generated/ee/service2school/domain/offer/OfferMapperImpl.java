package ee.service2school.domain.offer;

import ee.service2school.business.offer.dto.OfferDetailDto;
import ee.service2school.business.offer.dto.OfferDto;
import ee.service2school.business.offer.dto.OfferRequestDto;
import ee.service2school.domain.form.city.City;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-07T17:04:28+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class OfferMapperImpl implements OfferMapper {

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

    @Override
    public OfferDetailDto toDetailDto(Offer offer) {
        if ( offer == null ) {
            return null;
        }

        OfferDetailDto offerDetailDto = new OfferDetailDto();

        offerDetailDto.setName( offer.getName() );
        offerDetailDto.setDescription( offer.getDescription() );
        offerDetailDto.setPricePerStudent( offer.getPricePerStudent() );
        offerDetailDto.setStudentsMin( offer.getStudentsMin() );
        offerDetailDto.setStudentsMax( offer.getStudentsMax() );
        offerDetailDto.setCityId( offerCityId( offer ) );
        offerDetailDto.setCityName( offerCityName( offer ) );
        offerDetailDto.setAddress( offer.getAddress() );
        offerDetailDto.setPhone( offer.getPhone() );
        offerDetailDto.setDateAdd( offer.getDateAdd() );
        offerDetailDto.setAdditionalInfo( offer.getAdditionalInfo() );

        return offerDetailDto;
    }

    @Override
    public Offer toOffer(OfferRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Offer offer = new Offer();

        offer.setName( requestDto.getName() );
        offer.setDescription( requestDto.getDescription() );
        offer.setPricePerStudent( requestDto.getPricePerStudent() );
        offer.setStudentsMin( requestDto.getStudentsMin() );
        offer.setStudentsMax( requestDto.getStudentsMax() );
        offer.setAddress( requestDto.getAddress() );
        offer.setPhone( requestDto.getPhone() );

        return offer;
    }

    private Integer offerCityId(Offer offer) {
        if ( offer == null ) {
            return null;
        }
        City city = offer.getCity();
        if ( city == null ) {
            return null;
        }
        Integer id = city.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String offerCityName(Offer offer) {
        if ( offer == null ) {
            return null;
        }
        City city = offer.getCity();
        if ( city == null ) {
            return null;
        }
        String name = city.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
