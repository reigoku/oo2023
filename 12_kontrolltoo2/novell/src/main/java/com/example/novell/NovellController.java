package com.example.novell;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class NovellController {
    @Autowired
    NovellRepository novellRepository;
    @Autowired
    RaamatRepository raamatRepository;
    @GetMapping("novellPikkus")
    public int NovelliPikkus(
            @RequestParam Long id
    ){
        String novelliSisu = novellRepository.findById(id).get().getSisu();
        String tht = novelliSisu.replace(" ", "");
        return tht.length();
    }
    @GetMapping("raamatudSumma")
    public double RaamatudSumma(

    ){

        List<Double> hinnad = RaamatRepository.findAll();
        double lpphind = 0;
        for(int i = 0; i < hinnad.size(); i++){
            lpphind = lpphind +  parseDouble(hinnad.get(i));

        }
        return lpphind;
    }
    @GetMapping("pikimRaamat")
    public int PikimRaamat(){
        Raamat hinnad = RaamatRepository.findAll();

    }
}
