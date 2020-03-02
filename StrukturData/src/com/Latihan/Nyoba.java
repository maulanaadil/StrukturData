package com.Latihan;

import java.util.Scanner;

public class Nyoba {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("1. Pertambahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian ");
        System.out.print("Pilihan anda : ");
        int angka = userInput.nextInt();
            if (angka == 1) {
                Scanner number = new Scanner(System.in);
                System.out.println("Berapa banyak yg akan di jumlahkan : ");
                int jumlahAngka = number.nextInt();

                Scanner angkaInput = new Scanner(System.in);
                System.out.print("Masukan angka yg akan di jumlahkan : ");
                int masukAngka = angkaInput.nextInt();
                pertambahan(jumlahAngka, masukAngka);
            }
            if (angka == 2) {
                Scanner number = new Scanner(System.in);
                System.out.println("Berapa banyak yg akan di jumlahkan : ");
                int jumlahAngka = number.nextInt();

                Scanner angkaInput = new Scanner(System.in);
                System.out.print("Masukan angka yg akan di jumlahkan : ");
                int masukAngka = angkaInput.nextInt();
                pengurangan(jumlahAngka, masukAngka);
            }
            if (angka == 3) {
                Scanner number = new Scanner(System.in);
                System.out.println("Berapa banyak yg akan di jumlahkan : ");
                int jumlahAngka = number.nextInt();

                Scanner angkaInput = new Scanner(System.in);
                System.out.print("Masukan angka yg akan di jumlahkan : ");
                int masukAngka = angkaInput.nextInt();
                perkalian(jumlahAngka, masukAngka);
            }
            if (angka == 4) {
                Scanner number = new Scanner(System.in);
                System.out.println("Berapa banyak yg akan di jumlahkan : ");
                int jumlahAngka = number.nextInt();

                Scanner angkaInput = new Scanner(System.in);
                System.out.print("Masukan angka yg akan di jumlahkan : ");
                int masukAngka = angkaInput.nextInt();
                pembagian(jumlahAngka, masukAngka);
            } else {
                System.out.print("Kelebihan bro coba ulangi");
            }
    }
    private static void pertambahan(int angka, int masukAngka){
        for(int i = 0; i < angka; i++){
            int hasil = 0;
            hasil = masukAngka + i;
            System.out.println(i + " + " + masukAngka + " = " + hasil );
        }
    }
    private static void pengurangan(int angka, int masukAngka){
        for(int i = 0; i < angka; i++){
            int hasil = 0;
            hasil = masukAngka - i;
            System.out.println(i + " - " + masukAngka + " = " + hasil );
        }
    }

    private static void perkalian(int angka, int masukAngka){
        for(int i = 0; i < angka; i++){
            int hasil = 0;
            hasil = masukAngka * i;
            System.out.println(i + " * " + masukAngka + " = " + hasil );
        }
    }

    private static void pembagian(double angka, double masukAngka){
        for(int i = 0; i < angka; i++){
            double hasil = 0;
            hasil = i / masukAngka;
            System.out.println(masukAngka + " : " + i + " = " + hasil );
        }
    }

}
