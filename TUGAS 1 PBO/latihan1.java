/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 *//**Kelas induk (superclass)
  * 
  */
class Hewan {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Anjing extends Hewan {
    void suara() {
        System.out.println(nama + " mengerong: Guk Guk!");
    }
}

// Main class untuk menjalankan program
public class latihan1 {
   public static void main (String [] args){
    Anjing anjing = new Anjing ();
    anjing.nama = "doris";
    
    anjing.makan();
    anjing.suara();
   }
}