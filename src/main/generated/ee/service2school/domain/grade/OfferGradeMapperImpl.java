package ee.service2school.domain.grade;

import ee.service2school.business.offer.dto.OfferGradeRequestDto;
import ee.service2school.domain.form.grade.Grade;
import ee.service2school.domain.offer.Offer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-08T11:15:40+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class OfferGradeMapperImpl implements OfferGradeMapper {

    @Override
    public OfferGrade offerGradeRequestDtoToOfferGrade(OfferGradeRequestDto offerGradeRequestDto) {
        if ( offerGradeRequestDto == null ) {
            return null;
        }

        OfferGrade offerGrade = new OfferGrade();

        offerGrade.setOffer( offerGradeRequestDtoToOffer( offerGradeRequestDto ) );
        offerGrade.setGrade( offerGradeRequestDtoToGrade( offerGradeRequestDto ) );
        offerGrade.setId( offerGradeRequestDto.getId() );

        return offerGrade;
    }

    @Override
    public OfferGradeRequestDto offerGradeToOfferGradeRequestDto(OfferGrade offerGrade) {
        if ( offerGrade == null ) {
            return null;
        }

        Integer offerId = null;
        Integer gradeId = null;
        Integer gradeNumber = null;
        Integer id = null;

        offerId = offerGradeOfferId( offerGrade );
        gradeId = offerGradeGradeId( offerGrade );
        gradeNumber = offerGradeGradeNumber( offerGrade );
        id = offerGrade.getId();

        OfferGradeRequestDto offerGradeRequestDto = new OfferGradeRequestDto( id, offerId, gradeId, gradeNumber );

        return offerGradeRequestDto;
    }

    @Override
    public OfferGrade updateOfferGradeFromOfferGradeRequestDto(OfferGradeRequestDto offerGradeRequestDto, OfferGrade offerGrade) {
        if ( offerGradeRequestDto == null ) {
            return offerGrade;
        }

        if ( offerGrade.getOffer() == null ) {
            offerGrade.setOffer( new Offer() );
        }
        offerGradeRequestDtoToOffer1( offerGradeRequestDto, offerGrade.getOffer() );
        if ( offerGrade.getGrade() == null ) {
            offerGrade.setGrade( new Grade() );
        }
        offerGradeRequestDtoToGrade1( offerGradeRequestDto, offerGrade.getGrade() );
        if ( offerGradeRequestDto.getId() != null ) {
            offerGrade.setId( offerGradeRequestDto.getId() );
        }

        return offerGrade;
    }

    protected Offer offerGradeRequestDtoToOffer(OfferGradeRequestDto offerGradeRequestDto) {
        if ( offerGradeRequestDto == null ) {
            return null;
        }

        Offer offer = new Offer();

        offer.setId( offerGradeRequestDto.getOfferId() );

        return offer;
    }

    protected Grade offerGradeRequestDtoToGrade(OfferGradeRequestDto offerGradeRequestDto) {
        if ( offerGradeRequestDto == null ) {
            return null;
        }

        Grade grade = new Grade();

        grade.setId( offerGradeRequestDto.getGradeId() );
        grade.setNumber( offerGradeRequestDto.getGradeNumber() );

        return grade;
    }

    private Integer offerGradeOfferId(OfferGrade offerGrade) {
        if ( offerGrade == null ) {
            return null;
        }
        Offer offer = offerGrade.getOffer();
        if ( offer == null ) {
            return null;
        }
        Integer id = offer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer offerGradeGradeId(OfferGrade offerGrade) {
        if ( offerGrade == null ) {
            return null;
        }
        Grade grade = offerGrade.getGrade();
        if ( grade == null ) {
            return null;
        }
        Integer id = grade.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer offerGradeGradeNumber(OfferGrade offerGrade) {
        if ( offerGrade == null ) {
            return null;
        }
        Grade grade = offerGrade.getGrade();
        if ( grade == null ) {
            return null;
        }
        Integer number = grade.getNumber();
        if ( number == null ) {
            return null;
        }
        return number;
    }

    protected void offerGradeRequestDtoToOffer1(OfferGradeRequestDto offerGradeRequestDto, Offer mappingTarget) {
        if ( offerGradeRequestDto == null ) {
            return;
        }

        if ( offerGradeRequestDto.getOfferId() != null ) {
            mappingTarget.setId( offerGradeRequestDto.getOfferId() );
        }
    }

    protected void offerGradeRequestDtoToGrade1(OfferGradeRequestDto offerGradeRequestDto, Grade mappingTarget) {
        if ( offerGradeRequestDto == null ) {
            return;
        }

        if ( offerGradeRequestDto.getGradeId() != null ) {
            mappingTarget.setId( offerGradeRequestDto.getGradeId() );
        }
        if ( offerGradeRequestDto.getGradeNumber() != null ) {
            mappingTarget.setNumber( offerGradeRequestDto.getGradeNumber() );
        }
    }
}
