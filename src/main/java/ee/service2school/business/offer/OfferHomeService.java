package ee.service2school.business.offer;

import ee.service2school.business.offer.dto.*;
import ee.service2school.domain.form.city.City;
import ee.service2school.domain.form.city.CityService;
import ee.service2school.domain.form.grade.Grade;
import ee.service2school.domain.form.grade.GradeDto;
import ee.service2school.domain.form.grade.GradeService;
import ee.service2school.domain.form.subject.Subject;
import ee.service2school.domain.form.subject.SubjectDto;
import ee.service2school.domain.form.subject.SubjectService;
import ee.service2school.domain.grade.OfferGrade;
import ee.service2school.domain.grade.OfferGradeService;
import ee.service2school.domain.offer.*;
import ee.service2school.domain.subject.OfferSubject;
import ee.service2school.domain.subject.OfferSubjectService;
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

    @Resource
    private OfferGradeService offerGradeService;

    @Resource
    private OfferSubjectService offerSubjectService;

    @Resource
    private GradeService gradeService;

    @Resource
    private SubjectService subjectService;


    public List<OfferDto> getOffers() {
        List<Offer> offers = offerService.getLastFiveOffers();
        List<OfferDto> offerDtos = offerMapper.toDtos(offers);
        return offerDtos;
    }

    public List<OfferDto> getAllOffers() {
        List<Offer> offers = offerService.getAllOffers();
        List<OfferDto> offerDtos = offerMapper.toDtos(offers);
        return offerDtos;
    }

    public List<OfferDto> getActiveOffersByUser(Integer userId) {
        List<Offer> activeOffersByUserId = offerService.getActiveOffersByUserId(userId);
        List<OfferDto> activeOffers = offerMapper.toDtos(activeOffersByUserId);
        return activeOffers;
    }

    public void deleteOffer(Integer offerId) {
        Offer offer = offerService.findOfferByOfferId(offerId);
        offer.setStatus("D");
        offerService.saveOffer(offer);
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

    public void addGradeSubjectToOffer(GradeSubjectRequestDto dto) {
        Integer offerId = dto.getOfferId();
        Offer offer = offerService.findOfferByOfferId(offerId);
        List<GradeDto> gradeDtos1 = dto.getGrades();
        List<SubjectDto> subjectDtos1 = dto.getSubjects();
        saveSelectedGrades(offer, gradeDtos1);
        saveSelectedSubjects(offer, subjectDtos1);
    }

    private void saveSelectedGrades(Offer offer, List<GradeDto> gradeDtos1) {
        for (GradeDto gradeDto : gradeDtos1) {
            if (gradeDto.getIsSelected()) {
                Integer gradeId = gradeDto.getGradeId();
                Grade grade = gradeService.findGradeByGradeId(gradeId);
                OfferGrade offerGrade = new OfferGrade();
                offerGrade.setOffer(offer);
                offerGrade.setGrade(grade);
                offerGradeService.addOfferGrade(offerGrade);
            }
        }
    }

    private void saveSelectedSubjects(Offer offer, List<SubjectDto> subjectDtos1) {
        for (SubjectDto subjectDto : subjectDtos1) {
            if (subjectDto.getIsSelected()) {
                Integer subjectId = subjectDto.getSubjectId();
                Subject subject = subjectService.findSubjectBySubjectId(subjectId);
                OfferSubject offerSubject = new OfferSubject();
                offerSubject.setOffer(offer);
                offerSubject.setSubject(subject);
                offerSubjectService.addOfferSubject(offerSubject);
            }
        }
    }

    public void updateOffer(Integer offerId, OfferUpdate offerUpdate) {
        City city = cityService.getCityByCityId(offerUpdate.getCityId());
        Offer offer = offerService.findOfferByOfferId(offerId);
        offerMapper.updateOffer(offerUpdate, offer);
        offer.setCity(city);
        offerService.save(offer);
    }


}
