package com.squadGame.models;

import jakarta.persistence.*;

@Entity
@Table(name = "squad")
public class SquadGame {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;


}
