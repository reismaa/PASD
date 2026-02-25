package Praktikum03;

import java.util.Scanner;
public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen24[] arrayOfDosen = new Dosen24[3];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            dummy = sc.nextLine();
            if (dummy.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }

        DataDosen24 data = new DataDosen24();

        System.out.println("\n===== Semua Data Dosen =====");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n===== Jumlah Dosen Per Jenis Kelamin =====");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== Rata-Rata Usia Dosen =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== Dosen Paling Tua =====");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n===== Dosen Paling Muda =====");
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();

    }
}
