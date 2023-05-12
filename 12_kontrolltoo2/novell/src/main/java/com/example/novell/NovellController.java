package com.example.novell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovellController {
    @Autowired
    NovellRepository novellRepository;
    @Autowired
    RaamatRepository raamatRepository;
    @GetMapping("novellPikkus")
    public int NovelliPikkus(
            @RequestParam String sisu
    ){
        String novelliSisu = novellRepository.findBy(sisu).get();
        String tht = sisu.replace(" ", "");
        return tht.length();
    }
    @GetMapping("raamatudSumma")
    public double RaamatudSumma(

    ){

        List<maksumus> hinnad = RaamatRepository.findAll();
    }
}
