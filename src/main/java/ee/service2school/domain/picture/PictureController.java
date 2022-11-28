package ee.service2school.domain.picture;

import ee.service2school.domain.picture.picture.PictureMapper;
import ee.service2school.domain.picture.picture.PictureRepository;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PictureController {

    @Resource
    private PictureMapper pictureMapper;

    @Resource
    private PictureRepository pictureRepository;



//    public Image getPicture() {
//        Image entitie = pictureRepository.get
//        return null;
//    }

}
