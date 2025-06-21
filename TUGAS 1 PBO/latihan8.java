/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
// Interface Kendaraan
interface Kendaraan {
    void berjalan();
}

// Implementasi pertama: Mobil
class Mobil implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

// Implementasi kedua: Motor
class Motor implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

// Main class untuk menjalankan program
public class latihan8 {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil(); // Polimorfisme dengan Mobil
        Kendaraan kendaraan2 = new Motor(); // Polimorfisme dengan Motor

        kendaraan1.berjalan(); // Memanggil metode berjalan() dari Mobil
        kendaraan2.berjalan(); // Memanggil metode berjalan() dari Motor
    }
}