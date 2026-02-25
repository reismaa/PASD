package Praktikum03;

import java.util.Scanner;
public class MataKuliahDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlag Mata Kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        MataKuliah24[] arrayOfMataKuliah = new MataKuliah24[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMataKuliah[i] = new MataKuliah24();
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i=0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }

        sc.close();
    }
}
