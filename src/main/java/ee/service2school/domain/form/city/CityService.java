package ee.service2school.domain.form.city;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;


@Service
public class CityService {

    @Resource
    private CityRepository cityRepository;

    public City getCityByCityId(Integer cityId) {
        Optional<City> cityOptional = cityRepository.findById(cityId);
        City city = cityOptional.get();
        return city;
    }
}
