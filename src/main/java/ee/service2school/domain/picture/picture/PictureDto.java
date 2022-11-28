package ee.service2school.domain.picture.picture;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A DTO for the {@link Picture} entity
 */
@Data
public class PictureDto implements Serializable {
    private final Integer picId;
    @NotNull
    private final byte[] picData;
}