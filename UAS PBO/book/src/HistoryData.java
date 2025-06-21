public class HistoryData {
    private int id;
    private String nim;
    private String nama;
    private String buku;
    private String waktu;
    private int qty;

    // Constructor (diperbarui untuk menyertakan nim)
    public HistoryData(String nim, String nama, String buku, String waktu, int qty) {
        this.nim = nim;
        this.nama = nama;
        this.buku = buku;
        this.waktu = waktu;
        this.qty = qty;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBuku() {
        return buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
