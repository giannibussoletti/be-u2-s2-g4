package gianni_bussoletti.be_u2_s2_g4.payloads;

import java.time.LocalDateTime;
import java.util.List;

public record ErrorsWithListsDTO(String message, LocalDateTime timestamp, List<String> errorsList) {
}
