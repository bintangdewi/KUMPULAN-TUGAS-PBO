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
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Subclass pertama yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Subclass kedua yang mewarisi dari Hewan
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Main class untuk menjalankan program
public class latihan3 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();
        kucing1.makan();  // Memanggil metode dari superclass Hewan
        kucing1.suara();  // Memanggil metode dari subclass Kucing

        // Membuat objek Anjing
        Anjing anjing1 = new Anjing();
        anjing1.makan();  // Memanggil metode dari superclass Hewan
        anjing1.suara();  // Memanggil metode dari subclass Anjing
    }
}