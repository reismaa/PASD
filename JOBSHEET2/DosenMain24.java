package JOBSHEET2;

public class DosenMain24 {
    public static void main(String[] args) {

        Dosen24 d1 = new Dosen24();
        d1.idDosen = "DS001";
        d1.nama = "Dr. Budi Santoso";
        d1.statusAktif = true;
        d1.tahunBergabung = 2016;
        d1.bidangKeahlian = "Pemrograman";

        d1.tampilInformasi();
        d1.hitungMasaKerja(2026);
        d1.setStatusAktif(false);
        d1.ubahKeahlian("Artificial Intelligence");
        d1.tampilInformasi();

        Dosen24 d2 = new Dosen24("DS002","Dr. Siti Rahma",true,2018,"Basis Data");
        d2.tampilInformasi();
        d2.hitungMasaKerja(2026);
        d2.setStatusAktif(true);
        d2.ubahKeahlian("Data Science");
        d2.tampilInformasi();
    }
}
