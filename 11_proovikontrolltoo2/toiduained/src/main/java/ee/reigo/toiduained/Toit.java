package ee.reigo.toiduained;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Toit {

    @Id
    private String nimetus;

    @OneToMany
    private List<ToiduKomponent> toidukomponendid;
}
