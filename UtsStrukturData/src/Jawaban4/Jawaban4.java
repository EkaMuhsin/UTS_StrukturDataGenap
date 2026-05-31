/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jawaban4;

/**
 *
 * @author Windows
 */
import java.util.LinkedList;
import java.util.Queue;

public class Jawaban4 {

    public static void main(String[] args) {

        Queue<String> antrian = new LinkedList<>();

        // a. Menambahkan data pesanan pelanggan
        antrian.add("Burger");
        antrian.add("Kentang Goreng");
        antrian.add("Ayam Crispy");
        antrian.add("Es Teh");
        antrian.add("Pizza");

        // b. Menampilkan daftar antrean
        System.out.println("Daftar Antrean Pesanan:");
        System.out.println(antrian);

        // c. Memproses pesanan pertama
        String diproses = antrian.poll();

        System.out.println("\nPesanan yang diproses:");
        System.out.println(diproses);

        // d. Menampilkan antrean setelah pelayanan
        System.out.println("\nAntrean Setelah Pelayanan:");
        System.out.println(antrian);
    }
}