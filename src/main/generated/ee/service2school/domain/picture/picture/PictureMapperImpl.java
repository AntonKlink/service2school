package ee.service2school.domain.picture.picture;

import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-01T14:47:21+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class PictureMapperImpl implements PictureMapper {

    @Override
    public Picture pictureDtoToPicture(PictureDto pictureDto) {
        if ( pictureDto == null ) {
            return null;
        }

        Picture picture = new Picture();

        picture.setId( pictureDto.getPicId() );
        byte[] data = pictureDto.getPicData();
        if ( data != null ) {
            picture.setData( Arrays.copyOf( data, data.length ) );
        }

        return picture;
    }

    @Override
    public PictureDto pictureToPictureDto(Picture picture) {
        if ( picture == null ) {
            return null;
        }

        Integer picId = null;
        byte[] picData = null;

        picId = picture.getId();
        byte[] picData1 = picture.getData();
        if ( picData1 != null ) {
            picData = Arrays.copyOf( picData1, picData1.length );
        }

        PictureDto pictureDto = new PictureDto( picId, picData );

        return pictureDto;
    }

    @Override
    public Picture updatePictureFromPictureDto(PictureDto pictureDto, Picture picture) {
        if ( pictureDto == null ) {
            return picture;
        }

        if ( pictureDto.getPicId() != null ) {
            picture.setId( pictureDto.getPicId() );
        }
        byte[] data = pictureDto.getPicData();
        if ( data != null ) {
            picture.setData( Arrays.copyOf( data, data.length ) );
        }

        return picture;
    }
}
