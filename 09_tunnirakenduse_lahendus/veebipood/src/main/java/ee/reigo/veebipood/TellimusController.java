package ee.reigo.veebipood;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class TellimusController {
    @Autowired
    IsikRepository isikRepository;
    @Autowired
    ToodeRepository toodeRepository;
    @Autowired
    TellimusRepository tellimusRepository;
    /*List<Toode> tellimuseTooted = new ArrayList<>(Arrays.asList(
            new Toode(1,"Koola", 1.5),
            new Toode(2,"Fanta", 1.0),
            new Toode(3,"Sprite", 1.7),
            new Toode(4,"Vichy", 2.0),
            new Toode(5,"Vitamin well", 2.5)
    ));
    List<Toode> tellimuse2Tooted = new ArrayList<>(Arrays.asList(
            new Toode(1,"bepsi", 1.5),
            new Toode(2,"Fanta", 1.0),
            new Toode(3,"Spirte", 1.7),
            new Toode(4,"monsher", 2.0),
            new Toode(5,"Vitamin well", 2.5)
    ));*/
    /*Isik tellija = new Isik(1, "a", "a", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija, tellimuseTooted),
            new Tellimus(2, tellija, tellimuse2Tooted)
    ));*/
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimusRepository.findAll();
    }

    // DELETE localhost:8080/kustuta-tellimus/1
    @DeleteMapping("kustuta-tellimus/{index}")
    public String kustutaTellimus(@PathVariable int index) {
        tellimusRepository.deleteById(index);
        return "Tellimus kustutatud!";
    }
    // POST localhost:8080/lisa-tellimus
    @Autowired
    IsikController isikController;

    @Autowired
    ToodeController toodeController;
    // POST localhost:8080/lisa-tellimus?id=9&tellijaIndex=3&tooteIndex=2
    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaToode(
            @RequestParam int id,
            @RequestParam int tellijaId,
            @RequestParam int tooteIndex) {
//        IsikController isikController = new IsikController();
//        System.out.println(isikController); // MÄLUKOHT     Dependency Injection
        Isik tellija = isikRepository.findById(tellijaId).get();

//        ToodeController toodeController = new ToodeController();
        Toode tellitudToode = toodeRepository.findById(tooteIndex).get();
        List<Toode> tellitudTooted = new ArrayList<>(Arrays.asList(tellitudToode));

        tellimusRepository.save(new Tellimus(id, tellija, tellitudTooted));
        return tellimusRepository.findAll();
    }
    @PostMapping("lisa-tellimus2")
    public List<Tellimus> lisaToode2(
            @RequestParam int id,
            @RequestParam int tellijaIndex,
            @RequestParam List<Integer> tooteIds) throws Exception{
        Isik tellija = isikRepository.findById(tellijaIndex).get();
        List<Toode> tellitudTooted = new ArrayList<>();
        for(Integer i: tooteIds){
            if(i == 4){
                throw new Exception("Id 4 ei saa andmebaasi lisada");
            }
            Toode toode = toodeRepository.findById(i).get();
            tellitudTooted.add(toode);
        }
        tellimusRepository.save(new Tellimus(id, tellija, tellitudTooted));
        return tellimusRepository.findAll();

    }
    /*@PostMapping("lisa-tellimus3")
    public List<Tellimus> lisaTellimus3(
            @RequestBody Tellimus tellimus) {
        tellimused.add(tellimus);
        return tellimused;
    }*/
    @PostMapping("lisa-tellimus4")
    public List<Tellimus> lisaTellimus4(
            @RequestBody Tellimus tellimus) {
        Isik isik = isikRepository.findById(tellimus.getTellija().getId()).get();
        List<Toode> tellitudTooted = new ArrayList<>();
        for(Toode t: tellimus.getTooted()){
            Toode toode = toodeRepository.findById(t.getId()).get();
            tellitudTooted.add(toode);
        }
        tellimusRepository.save(new Tellimus(tellimus.getId(), isik, tellitudTooted));
        return tellimusRepository.findAll();
    }

    @GetMapping("saa-kogusumma")
    public double saaKogusumma(){
        List<Tellimus> tellimused = tellimusRepository.findAll();
        double kogusumma = 0;
        for( Tellimus t: tellimused){
            for (Toode toode : t.getTooted()){
                kogusumma = kogusumma + toode.getHind();
            }
        }
        return kogusumma;
    }

}
