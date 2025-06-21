/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jokos
 */
class MahasiswaItem {
    int id;
    String nim;
    String nama;

    MahasiswaItem(int id, String nim, String nama) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nim + " - " + nama;
    }

    public int getId() {
        return id;
    }

    public int getId(String check) {
        String check1 = this.nim + " - " + this.nama;
        if(check1.equals(check)){
            return 1;
        }
        return 0;
    }
}