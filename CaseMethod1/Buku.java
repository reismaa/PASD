package CaseMethod1;

public class Buku {
    String kode;
    String judul;
    int tahun;

    Buku(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kode + " | Judul: " + judul + " | Tahun: " + tahun);
    }
    
}
