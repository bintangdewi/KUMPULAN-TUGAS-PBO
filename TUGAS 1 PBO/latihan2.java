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
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Subclass kedua yang mewarisi dari Kucing (Multilevel Inheritance)
class AnjingCorgi extends Anjing {
    void jenis() {
        System.out.println("Ini adalah anjing corgi.");
    }
}

// Main class untuk menjalankan program
public class latihan2 {
    public static void main(String[] args) {
        AnjingCorgi corgi = new AnjingCorgi();

        corgi.makan();  // Dari superclass Hewan
        corgi.suara();  // Dari subclass Kucing
        corgi.jenis();  // Dari subclass KucingAnggora
    }
}