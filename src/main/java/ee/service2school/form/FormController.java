package ee.service2school.form;

import ee.service2school.form.city.CityDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class FormController {

    @Resource
    private FormService formService;

    @GetMapping("/test")
    @Operation(summary = "Esialgu saame kätte kõik linnad")
    public List<CityDto> getAllCities() {



        return null;

    }

}