package cz.gyarab.e2prg.s2;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Kocka extends Zvire {
    @Getter
    private int pocetZivotu;

    public Kocka(String jmeno) {
        super(jmeno);
        this.pocetZivotu = 9;
    }

    public void setPocetZivotu(int pocetZivotu) {
        if (pocetZivotu == 0) {
            jeZive = false;
        } else if (pocetZivotu > 0) {
            jeZive = true;
        }
        this.pocetZivotu = pocetZivotu;
    }
}
