package ee.service2school.form.city;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CityMapper {
    @Mapping(source = "cityId", target = "id")
    @Mapping(source = "cityName", target = "name")
    City cityDtoToCity(CityDto cityDto);

//    @InheritInverseConfiguration(name = "cityDtoToCity")
//    CityDto cityToCityDto(City city);

//    @InheritConfiguration(name = "cityDtoToCity")
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    City updateCityFromCityDto(CityDto cityDto, @MappingTarget City city);
}
