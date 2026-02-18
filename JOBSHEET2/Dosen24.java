package JOBSHEET2;

public class Dosen24 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen24() {
    }

    public Dosen24(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : "  + bidangKeahlian);
        System.out.println("-----------------------------------------");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen berhasil diubah.");
    }

    void hitungMasaKerja(int thnSekarang) {
        if (thnSekarang >= tahunBergabung) {
            thnSekarang -= tahunBergabung;
            System.out.println("Masa kerja dosen " + thnSekarang);
        } else {
            System.out.println("Tahun sekarang tidak valid.");
        }
    }
    
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi " + bidangKeahlian);
    }
}
