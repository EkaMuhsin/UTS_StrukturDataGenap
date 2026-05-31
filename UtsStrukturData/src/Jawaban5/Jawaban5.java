/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jawaban5;

/**
 *
 * @author Windows
 */
public class Jawaban5 {
    public static void main(String[] args) {

        String[] data = {
            "Wafiq", "Aril", "Zulfa",
            "Tamim", "Fakhrie", "Aan"
        };

        // Bubble Sort
        String[] bubble = data.clone();
        bubbleSort(bubble);

        // Selection Sort
        String[] selection = data.clone();
        selectionSort(selection);

        // Insertion Sort
        String[] insertion = data.clone();
        insertionSort(insertion);

        System.out.println("Data Awal:");
        tampilkan(data);

        System.out.println("\nHasil Bubble Sort:");
        tampilkan(bubble);

        System.out.println("\nHasil Selection Sort:");
        tampilkan(selection);

        System.out.println("\nHasil Insertion Sort:");
        tampilkan(insertion);
    }

    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void tampilkan(String[] arr) {
        for (String nama : arr) {
            System.out.print(nama + " ");
        }
        System.out.println();
    }
}
