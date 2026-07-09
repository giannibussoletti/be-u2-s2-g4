package gianni_bussoletti.be_u2_s2_g4.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
