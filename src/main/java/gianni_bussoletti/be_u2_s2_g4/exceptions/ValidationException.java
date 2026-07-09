package gianni_bussoletti.be_u2_s2_g4.exceptions;

import lombok.Getter;

import java.util.List;

@Getter
public class ValidationException extends RuntimeException {
    private List<String> errorsList;

    public ValidationException(List<String> errorsList) {
        super("Errori di validazione");
        this.errorsList = errorsList;
    }

    public ValidationException(String message) {
        super(message);
    }
}
