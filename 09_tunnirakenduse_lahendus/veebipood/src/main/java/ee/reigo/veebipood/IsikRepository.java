package ee.reigo.veebipood;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IsikRepository extends JpaRepository<Isik, Integer> {
    interface TellimusRepository {
    }
}
