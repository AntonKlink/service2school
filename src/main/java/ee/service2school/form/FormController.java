package ee.service2school.form;

import ee.service2school.form.city.City;
import ee.service2school.form.city.CityDto;
import ee.service2school.form.city.CityMapper;
import ee.service2school.form.city.CityRepository;
import ee.service2school.form.grade.Grade;
import ee.service2school.form.grade.GradeDto;
import ee.service2school.form.grade.GradeMapper;
import ee.service2school.form.grade.GradeRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FormController {

    @Resource
    private CityRepository cityRepository;

    @Resource
    private CityMapper cityMapper;

    @Resource
    private GradeRepository gradeRepository;

    @Resource
    private GradeMapper gradeMapper;

    @GetMapping("/test")
    @Operation(summary = "Siin on testlehekülg")

    public List<CityDto> getAllCityNames () {
        List<City> entities = cityRepository.findAll();
        List<CityDto> cityDtos = cityMapper.toCityDtos(entities);
        return cityDtos;
    }

    public List<GradeDto> getAllGrades() {
        List<Grade> entities = gradeRepository.findAll();
        List<GradeDto> gradeDtos = gradeMapper.toDtos(entities);
        return gradeDtos;
    }


}