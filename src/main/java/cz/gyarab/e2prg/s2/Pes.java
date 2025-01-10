package cz.gyarab.e2prg.s2;

public class Pes extends ZvireOld implements DelaZvuk {
    public String delaZvuk() {
        return "HAF";
    }

    @Override
    public int hlasitost() {
        return 0;
    }
}
