/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
import java.util.Random;
import java.util.Scanner;

public class TebakAngka{
    public static void main(String[] args) {
        Random rand = new Random();
        int angkaRahasia = rand.nextInt(100) + 1;  // angka 1 - 100
        Scanner input = new Scanner(System.in);
        int tebakan;
        int percobaan = 0;

        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Tebak angka antara 1 - 100.");
        System.out.println("Ketik 0 untuk keluar.");

        while (true) {
            System.out.print("Masukkan tebakan kamu: ");
            tebakan = input.nextInt();

            if (tebakan == 0) {
                System.out.println("Permainan dihentikan. Angka yang benar adalah: " + angkaRahasia);
                break;
            }

            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else {
                System.out.println("Selamat! Kamu berhasil menebak angka " + angkaRahasia + " dalam " + percobaan + " percobaan.");
                break;
            }
        }

        input.close();
    }
}