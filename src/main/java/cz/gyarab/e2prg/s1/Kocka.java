package cz.gyarab.e2prg.s1;

import lombok.ToString;

@ToString
public class Kocka extends Zvire {
    private int pocetZivotu;

    public Kocka(String jmeno) {
        super(jmeno);
        this.pocetZivotu = pocetZivotu;
    }

    public void setPocetZivotu(int pocetZivotu) {
        if (pocetZivotu == 0) {
            this.jeZiva = false;
        }
        this.pocetZivotu = pocetZivotu;
    }
}
