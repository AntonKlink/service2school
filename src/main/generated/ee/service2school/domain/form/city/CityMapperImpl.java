package ee.service2school.domain.form.city;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-01T14:47:21+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public CityDto toCityDto(City city) {
        if ( city == null ) {
            return null;
        }

        Integer cityId = null;
        String cityName = null;

        cityId = city.getId();
        cityName = city.getName();

        CityDto cityDto = new CityDto( cityId, cityName );

        return cityDto;
    }

    @Override
    public List<CityDto> toCityDtos(List<City> cities) {
        if ( cities == null ) {
            return null;
        }

        List<CityDto> list = new ArrayList<CityDto>( cities.size() );
        for ( City city : cities ) {
            list.add( toCityDto( city ) );
        }

        return list;
    }
}
