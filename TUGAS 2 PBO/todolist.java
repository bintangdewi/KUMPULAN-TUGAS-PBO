/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bintang2023
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{
    public static void main(String[] args) {
        ArrayList<String> tugas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu To-Do List ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Daftar Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine();  // Buang newline setelah input angka

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama tugas: ");
                    String tugasBaru = input.nextLine();
                    tugas.add(tugasBaru);
                    System.out.println("Tugas berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== Daftar Tugas ===");
                    if (tugas.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        for (int i = 0; i < tugas.size(); i++) {
                            System.out.println((i + 1) + ". " + tugas.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== Hapus Tugas ===");
                    if (tugas.isEmpty()) {
                        System.out.println("Tidak ada tugas untuk dihapus.");
                    } else {
                        for (int i = 0; i < tugas.size(); i++) {
                            System.out.println((i + 1) + ". " + tugas.get(i));
                        }
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        int index = input.nextInt();
                        if (index > 0 && index <= tugas.size()) {
                            String removedTask = tugas.remove(index - 1);
                            System.out.println("Tugas \"" + removedTask + "\" telah dihapus.");
                        } else {
                            System.out.println("Nomor tugas tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program. Sampai jumpa ya!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }
}