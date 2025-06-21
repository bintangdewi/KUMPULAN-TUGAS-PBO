/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
// Superclass
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass Kucing yang mewarisi dari Hewan
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

// Subclass Anjing yang mewarisi dari Hewan
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

// Main class untuk menjalankan program
public class latihan7 {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing(); // Polimorfisme
        Hewan hewan2 = new Kucing(); // Polimorfisme

        hewan1.bersuara(); // Memanggil metode bersuara() dari Anjing
        hewan2.bersuara(); // Memanggil metode bersuara() dari Kucing
    }
}