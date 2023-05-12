package com.example.novell;
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

public class Raamat {
    @Id
    private Long Id;
    private String nimi;
    private double maksumus;
    private int leheklg;
    @ManyToOne
    private Novell novell;


}
