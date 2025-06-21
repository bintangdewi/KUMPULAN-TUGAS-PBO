/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
// Interface pertama
interface Hewan {
    void makan();
}

// Interface kedua
interface Mamalia {
    void menyusui();
}

// Kelas Kucing mengimplementasikan kedua interface
class Anjing implements Hewan, Mamalia {
    @Override
    public void makan() {
        System.out.println("Anjing makan daging.");
    }

    @Override
    public void menyusui() {
        System.out.println("Anjing menyusui anaknya.");
    }
}

// Main class untuk menjalankan program
public class latihan4 {
    public static void main(String[] args) {
        Anjing anjing1 = new Anjing();

        anjing1.makan();     // Memanggil metode dari interface Hewan
        anjing1.menyusui();  // Memanggil metode dari interface Mamalia
    }
}