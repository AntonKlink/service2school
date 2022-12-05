package ee.service2school.business.picture;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/photo", produces = MediaType.APPLICATION_JSON_VALUE)
public class PictureController {

    @Resource
    private PictureService pictureService;

    @PostMapping()
    public void addPicture(@RequestBody PictureDto request) {
        pictureService.addPicture(request);
    }

}
