/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
// Kelas Kalkulator dengan metode overloading
class Kalkulator {
    // Metode pertama: Menjumlahkan dua angka
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode kedua: Menjumlahkan tiga angka (Overloading)
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode ketiga: Menjumlahkan dua angka desimal (Overloading)
    double tambah(double a, double b) {
        return a + b;
    }
}

// Main class untuk menjalankan program
public class latihan6 {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        // Memanggil metode pertama
        System.out.println(k.tambah(10, 20));  

        // Memanggil metode kedua
        System.out.println(k.tambah(9, 10, 50));  

        // Memanggil metode ketiga
        System.out.println(k.tambah(2.5, 6.5));  
    }
}