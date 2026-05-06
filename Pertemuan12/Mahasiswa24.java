package Pertemuan12;

public class Mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    Mahasiswa24() {
    }

    Mahasiswa24(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
    }
}
