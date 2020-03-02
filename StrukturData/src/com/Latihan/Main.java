package com.Latihan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int hasilAngka = inputUser.nextInt();
        int b = 0;
        while (hasilAngka != 0){
            int a = hasilAngka % 10;
            b = b * 10 + a;
            hasilAngka= hasilAngka / 10;
        }
        System.out.print("Hasil : " + b);
    }
}
