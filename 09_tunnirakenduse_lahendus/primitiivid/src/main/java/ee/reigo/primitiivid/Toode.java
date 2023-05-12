package ee.reigo.primitiivid;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Toode {
    @Id
    private int id;
    private String nimi;
    private double hind;
    private boolean aktiivne;
}
