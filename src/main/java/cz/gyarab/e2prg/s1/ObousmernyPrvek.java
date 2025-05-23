package cz.gyarab.e2prg.s1;

public class ObousmernyPrvek {
    int hodnota;
    ObousmernyPrvek dalsi;
    ObousmernyPrvek predchozi;

    public ObousmernyPrvek(int hodnota, ObousmernyPrvek dalsi, ObousmernyPrvek predchozi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        this.predchozi = predchozi;
    }
}
