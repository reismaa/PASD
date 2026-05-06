package Pertemuan12Tugas;

public class Mahasiswa {
    String nim, nama, jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilkanData() {
        System.out.printf("%-10s %-10s %-10s\n", nim, nama, jurusan);
    }
    
}
