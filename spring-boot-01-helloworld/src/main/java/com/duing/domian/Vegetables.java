package com.duing.domian;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Vegetables {

    private String potato;
    private String greenpeper;
    private String eggplant;

    public Vegetables(String potato, String greenpeper, String eggplant) {
        this.potato = potato;
        this.greenpeper = greenpeper;
        this.eggplant = eggplant;
    }
}
