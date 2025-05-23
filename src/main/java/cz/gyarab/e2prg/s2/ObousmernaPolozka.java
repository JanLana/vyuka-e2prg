package cz.gyarab.e2prg.s2;

public class ObousmernaPolozka {
    int hodnota;
    ObousmernaPolozka dalsi;
    ObousmernaPolozka predchozi;

    public ObousmernaPolozka(int hodnota, ObousmernaPolozka dalsi, ObousmernaPolozka predchozi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        this.predchozi = predchozi;
    }
}
