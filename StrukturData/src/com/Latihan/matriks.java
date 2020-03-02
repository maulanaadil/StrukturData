package com.Latihan;

public class matriks {
    public static void main(String[] args) {
        int[][] matriksA = {
                {1, 2},
                {3, 4}
        };

        int[][] matriksB = {
                {1, 2},
                {3, 4}
        };

        printDataArray(matriksA);
        printDataArray(matriksB);
        System.out.println("-------------------------------- +");
        printDataArray(penjumlahanArray(matriksA,matriksB));

        printDataArray(penguranganArray(matriksA,matriksB));
    }

    private static int[][] penguranganArray(int[][] dataArray1, int[][] dataArray2){
        int baris = dataArray1.length;
        int kolom = dataArray1[0].length;

        int hasil[][] = new int[baris][kolom];

        for (int i = 0; i<baris; i++){
            for (int j = 0; j<kolom; j++){
                hasil[i][j] = dataArray1[i][j] - dataArray2[i][j];
            }
        }
        return hasil;
    }

    private static int[][] penjumlahanArray(int[][] dataArray1, int[][] dataArray2){
        int baris = dataArray1.length;
        int kolom = dataArray1[0].length;

        int[][] hasil = new int[baris][kolom];

        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                hasil[i][j] = dataArray1[i][j] + dataArray2[i][j];
            }
        }
        return hasil;
    }

    private static void printDataArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }

            }
            System.out.println();
        }
        System.out.println();
    }
}
