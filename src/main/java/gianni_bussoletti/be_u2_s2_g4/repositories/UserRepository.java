package gianni_bussoletti.be_u2_s2_g4.repositories;

import gianni_bussoletti.be_u2_s2_g4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    boolean existsByMail(String mail);
}
