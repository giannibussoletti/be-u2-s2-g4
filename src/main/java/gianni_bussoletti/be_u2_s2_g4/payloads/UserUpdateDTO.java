package gianni_bussoletti.be_u2_s2_g4.payloads;

import java.time.LocalDate;

public record UserUpdateDTO(String name,
                            String surname,
                            String mail,
                            LocalDate birthDate) {
}
