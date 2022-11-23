package ee.service2school.form;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class FormController {

@Resource
private FormService formService;

@GetMapping("/test")
@Operation(summary = "Siin on testlehekülg")



}