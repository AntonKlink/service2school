package ee.service2school.domain.form;

import ee.service2school.domain.form.city.CityRepository;
import ee.service2school.domain.form.subject.Subject;
import ee.service2school.domain.form.city.City;
import ee.service2school.domain.form.city.CityDto;
import ee.service2school.domain.form.city.CityMapper;
import ee.service2school.domain.form.grade.Grade;
import ee.service2school.domain.form.grade.GradeDto;
import ee.service2school.domain.form.grade.GradeMapper;
import ee.service2school.domain.form.grade.GradeRepository;
import ee.service2school.domain.form.subject.SubjectDto;
import ee.service2school.domain.form.subject.SubjectMapper;
import ee.service2school.domain.form.subject.SubjectRepository;
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
    private GradeRepository gradeRepository;

    @Resource
    private SubjectRepository subjectRepository;

    @Resource
    private CityMapper cityMapper;

    @Resource
    private GradeMapper gradeMapper;

    @Resource
    private SubjectMapper subjectMapper;


    @GetMapping("/views/db")
    @Operation(summary = "Siia tuleb linnade loetelu")

    public List<CityDto> getAllCityNames() {
        List<City> entities = cityRepository.findAll();
        List<CityDto> cityDtos = cityMapper.toCityDtos(entities);
        return cityDtos;
    }

    @GetMapping("/filter/grade")
    @Operation(summary = "Siia tuleb klasside loetelu")
    public List<GradeDto> getAllGrades() {
        List<Grade> entities = gradeRepository.findAll();
        List<GradeDto> gradeDtos = gradeMapper.toDtos(entities);
        return gradeDtos;
    }

    @GetMapping("/filter/subject")
    @Operation(summary = "Siia tuleb ainete loetelu")
    public List<SubjectDto> getAllSubjects() {
        List<Subject> entities = subjectRepository.findAll();
        List<SubjectDto> subjectDtos = subjectMapper.toDtos(entities);
        return subjectDtos;
    }
}