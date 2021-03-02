package io.getlime.security.powerauth.lib.nextstep.model.exception;

/**
 * Exception for case when operation is not valid.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
public class OperationNotValidException extends NextStepServiceException {

    public static final String CODE = "OPERATION_NOT_VALID";

    /**
     * Constructor with error message.
     * @param message Error message.
     */
    public OperationNotValidException(String message) {
        super(message);
    }

}
