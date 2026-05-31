/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jawaban3;

/**
 *
 * @author Windows
 */
import java.util.Stack;

public class Jawaban3 {

    public static void main(String[] args) {

        Stack<String> aksi = new Stack<>();

        aksi.push("Mengetik teks");
        aksi.push("Menghapus teks");
        aksi.push("Mengganti warna");
        aksi.push("Menambahkan objek");
        aksi.push("Memperbesar gambar");

        System.out.println("Daftar aksi dalam Stack:");
        System.out.println(aksi);

        System.out.println("\nMelakukan Undo:");

        System.out.println("Undo: " + aksi.pop());
        System.out.println("Undo: " + aksi.pop());

        System.out.println("\nSisa aksi dalam Stack:");
        System.out.println(aksi);
    }
}
