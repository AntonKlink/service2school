package ee.service2school.form.city;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link City} entity
 */
@Data
public class CityDto implements Serializable {
    private final Integer cityId;
    @Size(max = 50)
    @NotNull
    private final String cityName;
}