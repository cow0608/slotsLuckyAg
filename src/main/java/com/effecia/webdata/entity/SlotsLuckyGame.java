package com.effecia.webdata.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the slots_lucky_game database table.
 *
 */
@Entity
@Table(name="slots_lucky_game")
@NamedQuery(name="SlotsLuckyGame.findAll", query="SELECT s FROM SlotsLuckyGame s")
public class SlotsLuckyGame implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="slots_lucky_game")
    private String slotsLuckyGame;

    public SlotsLuckyGame() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlotsLuckyGame() {
        return this.slotsLuckyGame;
    }

    public void setSlotsLuckyGame(String slotsLuckyGame) {
        this.slotsLuckyGame = slotsLuckyGame;
    }

}