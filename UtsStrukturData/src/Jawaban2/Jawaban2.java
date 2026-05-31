/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jawaban2;

/**
 *
 * @author Windows
 */
public class Jawaban2 {
    public class PenjualanMinimarket {
    public static void main(String[] args) {

        // Data penjualan 3 produk selama 7 hari
        int[][] penjualan = {
            {10, 12, 15, 11, 13, 14, 16}, // Produk A
            {8, 9, 10, 12, 11, 13, 14},   // Produk B
            {15, 14, 16, 18, 17, 19, 20}  // Produk C
        };

        String[] produk = {"Produk A", "Produk B", "Produk C"};

        // d. Menampilkan data dalam bentuk tabel
        System.out.println("Data Penjualan Selama 7 Hari");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(produk[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTotal Penjualan Tiap Produk:");

        int maxTotal = 0;
        String produkTerlaris = "";

        // b. Menghitung total penjualan tiap produk
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;

            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            System.out.println(produk[i] + " = " + total);

            // c. Menentukan produk dengan penjualan tertinggi
            if (total > maxTotal) {
                maxTotal = total;
                produkTerlaris = produk[i];
            }
        }

        System.out.println("\nProduk dengan penjualan tertinggi:");
        System.out.println(produkTerlaris + " = " + maxTotal);
    }
}
}
