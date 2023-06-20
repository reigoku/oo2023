package ee.reigo.toiduained;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToitController {
    @Autowired
    ToitRepository toitRepository;

    @GetMapping("toidu-valgud")
    public int toiduValgud(
            @RequestParam String nimetus
    ){
        Toit toit = toitRepository.findById(nimetus).get();
        List<ToiduKomponent> toidukomponendid = toit.getToidukomponendid();
        int valk = 0;
        for(ToiduKomponent t: toidukomponendid){
            valk += t.getToiduaine().getValk() * t.getKogus() / 100;
        }
        return valk;

    }

    @GetMapping("saa-toiduained")
    public List<Toiduaine> saaToiduained(
            @RequestParam String nimetus
    ){
        Toit toit = toitRepository.findById(nimetus).get();
        List<ToiduKomponent> toidukomponendid = toit.getToidukomponendid();
        int kogus = 0;
        for(ToiduKomponent t: toidukomponendid){
            kogus += t.getKogus();
        }
        return new ArrayList<>();
    }
}
