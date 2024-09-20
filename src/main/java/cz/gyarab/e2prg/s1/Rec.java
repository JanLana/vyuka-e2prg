package cz.gyarab.e2prg.s1;

import java.util.Scanner;

public class Rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = {1, 3, 6, 2, 7, 13, 20, 12, 21, 11};

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
