package com.codeline.Task1.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity

public class Game extends BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int team1;

    private int team2;

    private int score1;

    private int score2;
}
