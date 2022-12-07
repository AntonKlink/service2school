package ee.service2school.domain.subject;

import ee.service2school.business.offer.dto.OfferSubjectRequestDto;
import ee.service2school.domain.form.subject.Subject;
import ee.service2school.domain.offer.Offer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-07T17:04:28+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class OfferSubjectMapperImpl implements OfferSubjectMapper {

    @Override
    public OfferSubject offerSubjectRequestDtoToOfferSubject(OfferSubjectRequestDto offerSubjectRequestDto) {
        if ( offerSubjectRequestDto == null ) {
            return null;
        }

        OfferSubject offerSubject = new OfferSubject();

        offerSubject.setOffer( offerSubjectRequestDtoToOffer( offerSubjectRequestDto ) );
        offerSubject.setSubject( offerSubjectRequestDtoToSubject( offerSubjectRequestDto ) );
        offerSubject.setId( offerSubjectRequestDto.getId() );

        return offerSubject;
    }

    @Override
    public OfferSubjectRequestDto offerSubjectToOfferSubjectRequestDto(OfferSubject offerSubject) {
        if ( offerSubject == null ) {
            return null;
        }

        Integer offerId = null;
        Integer subjectId = null;
        String subjectName = null;
        Integer id = null;

        offerId = offerSubjectOfferId( offerSubject );
        subjectId = offerSubjectSubjectId( offerSubject );
        subjectName = offerSubjectSubjectName( offerSubject );
        id = offerSubject.getId();

        OfferSubjectRequestDto offerSubjectRequestDto = new OfferSubjectRequestDto( id, offerId, subjectId, subjectName );

        return offerSubjectRequestDto;
    }

    @Override
    public OfferSubject updateOfferSubjectFromOfferSubjectRequestDto(OfferSubjectRequestDto offerSubjectRequestDto, OfferSubject offerSubject) {
        if ( offerSubjectRequestDto == null ) {
            return offerSubject;
        }

        if ( offerSubject.getOffer() == null ) {
            offerSubject.setOffer( new Offer() );
        }
        offerSubjectRequestDtoToOffer1( offerSubjectRequestDto, offerSubject.getOffer() );
        if ( offerSubject.getSubject() == null ) {
            offerSubject.setSubject( new Subject() );
        }
        offerSubjectRequestDtoToSubject1( offerSubjectRequestDto, offerSubject.getSubject() );
        if ( offerSubjectRequestDto.getId() != null ) {
            offerSubject.setId( offerSubjectRequestDto.getId() );
        }

        return offerSubject;
    }

    protected Offer offerSubjectRequestDtoToOffer(OfferSubjectRequestDto offerSubjectRequestDto) {
        if ( offerSubjectRequestDto == null ) {
            return null;
        }

        Offer offer = new Offer();

        offer.setId( offerSubjectRequestDto.getOfferId() );

        return offer;
    }

    protected Subject offerSubjectRequestDtoToSubject(OfferSubjectRequestDto offerSubjectRequestDto) {
        if ( offerSubjectRequestDto == null ) {
            return null;
        }

        Subject subject = new Subject();

        subject.setId( offerSubjectRequestDto.getSubjectId() );
        subject.setName( offerSubjectRequestDto.getSubjectName() );

        return subject;
    }

    private Integer offerSubjectOfferId(OfferSubject offerSubject) {
        if ( offerSubject == null ) {
            return null;
        }
        Offer offer = offerSubject.getOffer();
        if ( offer == null ) {
            return null;
        }
        Integer id = offer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer offerSubjectSubjectId(OfferSubject offerSubject) {
        if ( offerSubject == null ) {
            return null;
        }
        Subject subject = offerSubject.getSubject();
        if ( subject == null ) {
            return null;
        }
        Integer id = subject.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String offerSubjectSubjectName(OfferSubject offerSubject) {
        if ( offerSubject == null ) {
            return null;
        }
        Subject subject = offerSubject.getSubject();
        if ( subject == null ) {
            return null;
        }
        String name = subject.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected void offerSubjectRequestDtoToOffer1(OfferSubjectRequestDto offerSubjectRequestDto, Offer mappingTarget) {
        if ( offerSubjectRequestDto == null ) {
            return;
        }

        if ( offerSubjectRequestDto.getOfferId() != null ) {
            mappingTarget.setId( offerSubjectRequestDto.getOfferId() );
        }
    }

    protected void offerSubjectRequestDtoToSubject1(OfferSubjectRequestDto offerSubjectRequestDto, Subject mappingTarget) {
        if ( offerSubjectRequestDto == null ) {
            return;
        }

        if ( offerSubjectRequestDto.getSubjectId() != null ) {
            mappingTarget.setId( offerSubjectRequestDto.getSubjectId() );
        }
        if ( offerSubjectRequestDto.getSubjectName() != null ) {
            mappingTarget.setName( offerSubjectRequestDto.getSubjectName() );
        }
    }
}
