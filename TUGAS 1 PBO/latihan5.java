/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
// Superclass (kelas induk)
class Hewan {
    String nama;

    // Konstruktor dengan parameter
    Hewan(String nama) {
        this.nama = nama;
    }

    // Metode untuk menampilkan informasi
    void info() {
        System.out.println("Nama: " + nama);
    }
}

// Subclass yang mewarisi dari Hewan
class Kucing extends Hewan {
    // Konstruktor yang memanggil konstruktor superclass dengan 'super'
    Kucing(String nama) {
        super(nama);
    }
}

// Main class untuk menjalankan program
public class latihan5 {
    public static void main(String[] args) {
        // Membuat objek Kucing dengan nama "Tom"
        Kucing kucing1 = new Kucing("Meng");

        // Memanggil metode info dari superclass Hewan
        kucing1.info();
    }
}