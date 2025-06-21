/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
import java.util.Scanner;

public class KalkulatorSederhana{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
           
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = input.next().charAt(0);

            double hasil;
            boolean valid = true;

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case '%':
                    if (angka2 != 0) {
                        hasil = angka1 % angka2;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Modulo dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Error: Operator tidak valid!");
                    valid = false;
            }

            System.out.print("Ingin menghitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih telah menggunakan kalkulator!");
        input.close();
    }
}