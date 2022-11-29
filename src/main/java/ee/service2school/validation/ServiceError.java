package ee.service2school.validation;


public enum ServiceError {
    INCORRECT_CREDENTIALS("Kasutajat ei ole", "111"),
    USERNAME_TAKEN("Email on juba kasutusel. Vali teine emaili aadress.", "222");


    private String message;
    private String errorCode;

    ServiceError(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
