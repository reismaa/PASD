package JOBSHEET2;

public class MataKuliah24 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah24 () {
    }

    public MataKuliah24(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-------------------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. Total jam sekarang: " + jumlahJam);
    }

    void kurangJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam sekrang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi.");
        }
    }
}
