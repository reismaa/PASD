package JOBSHEET2;

public class MataKuliahMain24 {

    public static void main(String[] args) {
        
        MataKuliah24 mk1 = new MataKuliah24();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma & Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangJam(3);
        mk1.tampilInformasi();

        MataKuliah24 mk2 = new MataKuliah24("IF202", "Basis Data", 3, 6);
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangJam(3);
        mk2.tampilInformasi();
    }
    
}
