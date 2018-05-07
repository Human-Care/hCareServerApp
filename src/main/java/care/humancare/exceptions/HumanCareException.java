package care.humancare.exceptions;

public class HumanCareException extends RuntimeException {

    public HumanCareException() {
        super();
    }

    public HumanCareException(String message) {
        super(message);
    }

    public HumanCareException(String message, Throwable cause) {
        super(message, cause);
    }
}
