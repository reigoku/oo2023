package ee.reigo.veebipood;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IsikController {
    @Autowired
    IsikRepository isikRepository;
    /*public List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1, "", "", new Date()),
            new Isik(2, "", "", new Date()),
            new Isik(3, "", "", new Date()),
            new Isik(4, "", "", new Date()),
            new Isik(5, "", "", new Date())
    ));*/
    @GetMapping("isikud")
    public List<Isik> saaIsikud() {return isikRepository.findAll();
    }
    @DeleteMapping("kustuta-isik-variant-2/{index}")
    public String kustutaIsikVariant2(@PathVariable int index) {
        isikRepository.deleteById(index);
        return "kustutatud!";
    }
    @GetMapping("lisa-isik")
    public List<Isik> lisaIsik(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi,
            @RequestParam Date loomisaeg) {
        isikRepository.save(new Isik(id, eesnimi, perenimi, loomisaeg));
        return isikRepository.findAll();
    }
}
