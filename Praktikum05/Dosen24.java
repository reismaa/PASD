package Praktikum05;

public class Dosen24 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen24 (String kd, String nm, boolean jk, int usia) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        this.usia = usia;
    }
    
    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";

        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia : " + usia);
        System.out.println("--------------------");

    }
}
