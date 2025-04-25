package cz.gyarab.e2prg.s2;

public class PolozkaSeznamu {
    int hodnota;
    PolozkaSeznamu dalsi;

    public PolozkaSeznamu(int hodnota, PolozkaSeznamu dalsi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
    }
}
