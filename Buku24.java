public class Buku24 {
    
    String kodeBuku;
    String judulBuku;
    String penulis;
    Boolean statusPeminjaman;

    public Buku24 (String kodeBuku, String judulBuku, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.statusPeminjaman = false;
    }

    public void tampilkanInfo() {
        System.out.println(kodeBuku + " - " + judulBuku + " oleh " + penulis + " | Status: " + (statusPeminjaman ? "Dipinjam" : "Tersedia"));
    }

}
