package ee.reigo.veebipood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeListController {
    @Autowired
    ToodeRepository toodeRepository;
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1,"Koola", 1.5),
            new Toode(2,"Fanta", 1.0),
            new Toode(3,"Sprite", 1.7),
            new Toode(4,"Vichy", 2.0),
            new Toode(5,"Vitamin well", 2.5)
    ));

    @GetMapping("tooted")
    public List<Toode> saaTooted() {
        return toodeRepository.findAll();
    }
    @DeleteMapping("kustuta-toode/{index}")
    public List<Toode> kustutaToode(@PathVariable int index) {
        toodeRepository.deleteById(index);
        return toodeRepository.findAll();
    }
    @DeleteMapping("kustuta-toode-variant-2/{index}")
    public String kustutaToodeVariant2(@PathVariable int index) {
        toodeRepository.deleteById(index);
        return "Toode kustutatud!";
    }

    @GetMapping("lisa-toode/{id}/{nimi}/{hind}/{aktiivne}")
    public List<Toode> lisaToode(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable boolean aktiivne) {
        toodeRepository.save(new Toode(id, nimi, hind));
        return toodeRepository.findAll();
    }
    @GetMapping("lisa-toode")
    public List<Toode> lisaToodeParameetritega(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind,
            @RequestParam boolean aktiivne) {
        toodeRepository.save(new Toode(id, nimi, hind));
        return toodeRepository.findAll();
    }//localhost:8080/lisa-toode?id=8"&nimi="aaa"&hind=2&aktiivne=true

    @GetMapping("hind-dollaritesse/{kurss}")
    public List<Toode> hindDollaritesse(@PathVariable double kurss) {
//        for (int i = 0; i < tooted.size(); i++) {
//            double vanaHind = tooted.get(i).getHind();
//            double uusHind = vanaHind * kurss;
//            tooted.get(i).setHind(uusHind);
//        }  sobib nii For Each (ülal) kui Enhanced For tsükkel
        for (Toode toode : tooted) {
            double vanaHind = toode.getHind();
            double uusHind = vanaHind * kurss;
            toode.setHind(uusHind);
        }
        return tooted;
    }

    @GetMapping("ostukorvi-kogusumma")
    public double ostukorviKogusumma(@RequestBody List<Toode> tooted){
        double sum = 0;
        for(Toode toode: tooted){
            sum = sum + toode.getHind();
        }
        return sum;
    }
}