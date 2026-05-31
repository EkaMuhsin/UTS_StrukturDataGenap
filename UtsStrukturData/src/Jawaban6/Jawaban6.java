/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jawaban6;

/**
 *
 * @author Windows
 */
public class Jawaban6 {
     public static void main(String[] args) {

        int[] harga = {
            75000, 120000, 45000, 90000, 30000,
            150000, 60000, 200000, 85000, 50000
        };

        System.out.println("Data Harga Sebelum Sorting:");
        tampilkan(harga);

        // Bubble Sort
        for (int i = 0; i < harga.length - 1; i++) {
            for (int j = 0; j < harga.length - i - 1; j++) {

                if (harga[j] > harga[j + 1]) {
                    int temp = harga[j];
                    harga[j] = harga[j + 1];
                    harga[j + 1] = temp;
                }
            }
        }

        System.out.println("\nData Harga Setelah Sorting:");
        tampilkan(harga);
    }

    public static void tampilkan(int[] data) {
        for (int harga : data) {
            System.out.print(harga + " ");
        }
        System.out.println();
    }
}
