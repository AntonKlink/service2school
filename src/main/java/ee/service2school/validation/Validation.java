package ee.service2school.validation;

import ee.service2school.domain.user.User;
import ee.service2school.infrastructure.exception.BusinessException;

import java.util.Optional;

public class Validation {


    public static void validateCorrectCredentials(Optional<User> userOptional) {
        if (userOptional.isEmpty()) {
            throw new BusinessException(ServiceError.INCORRECT_CREDENTIALS.getMessage(), ServiceError.INCORRECT_CREDENTIALS.getErrorCode());
        }
    }
}
