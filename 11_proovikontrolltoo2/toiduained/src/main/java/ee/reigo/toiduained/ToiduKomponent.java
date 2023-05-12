package ee.reigo.toiduained;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class ToiduKomponent {
    @Id
    private Long Id;
    @ManyToOne
    private Toiduaine toiduaine;
    private int kogus;


}
