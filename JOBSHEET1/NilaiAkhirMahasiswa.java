import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukka Nilai Kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextDouble();

        System.out.println("==============================");


        // validasi nilai
        if (tugas < 0 || tugas > 100 || 
            kuis < 0 || kuis > 100 || 
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("==============================");

        }

        // hitung nilai akhir
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        String nilaiHuruf;
        String keterangan;

        // konversi nilai 
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            keterangan ="SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            keterangan = "ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            keterangan = "ANDA TIDAK LULUS";
        }


        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println(keterangan);
        
        sc.close();
    }

}
