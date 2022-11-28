package ee.service2school.domain.picture.picture;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PictureMapper {
    @Mapping(source = "picId", target = "id")
    @Mapping(source = "picData", target = "data")
    Picture pictureDtoToPicture(PictureDto pictureDto);

    @InheritInverseConfiguration(name = "pictureDtoToPicture")
    PictureDto pictureToPictureDto(Picture picture);

    @InheritConfiguration(name = "pictureDtoToPicture")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Picture updatePictureFromPictureDto(PictureDto pictureDto, @MappingTarget Picture picture);
}
