package cz.gyarab.e2prg.s1;

public class EratosthenovoSito {
    public static void main(String[] args) {
        boolean [] arr = new boolean[Integer.MAX_VALUE-1000];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == false) {
                System.out.println(i);
                for (int j = i; j < arr.length; j += i) {
                    System.out.println("j=" + j);
                    arr[j] = true;
                }
            }

        }
    }
}
