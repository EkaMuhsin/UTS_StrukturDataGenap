/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jawaban1;

/**
 *
 * @author Windows
 */
public class Jawaban1 {
    public class DenahKursi {
    public static void main(String[] args) {

        // Membuat array 2 dimensi 5x5
        int[][] kursi = new int[5][5];

        // Sebelum ada kursi yang diisi
        System.out.println("Denah Kursi Sebelum Diisi:");
        tampilkanKursi(kursi);

        // Mengisi beberapa kursi (1 = terisi)
        kursi[0][1] = 1;
        kursi[1][3] = 1;
        kursi[2][2] = 1;
        kursi[3][0] = 1;
        kursi[4][4] = 1;

        // Setelah beberapa kursi diisi
        System.out.println("\nDenah Kursi Setelah Diisi:");
        tampilkanKursi(kursi);

        // Menghitung kursi kosong dan terisi
        int kosong = 0;
        int terisi = 0;

        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {

                if (kursi[i][j] == 0) {
                    kosong++;
                } else {
                    terisi++;
                }
            }
        }

        // Menampilkan hasil perhitungan
        System.out.println("\nJumlah Kursi Kosong : " + kosong);
        System.out.println("Jumlah Kursi Terisi : " + terisi);
    }

    // Method untuk menampilkan denah kursi
    public static void tampilkanKursi(int[][] kursi) {
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                System.out.print(kursi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
}
