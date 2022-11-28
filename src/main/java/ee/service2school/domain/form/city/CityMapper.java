package ee.service2school.domain.form.city;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CityMapper {
    @Mapping(source = "id", target = "cityId")
    @Mapping(source = "name", target = "cityName")

    CityDto toCityDto(City city);


    List<CityDto> toCityDtos(List<City> cities);




}
