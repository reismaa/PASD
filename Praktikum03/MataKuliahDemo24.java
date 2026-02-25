package Praktikum03;

import java.util.Scanner;
public class MataKuliahDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah24[] arrayOfMataKuliah = new MataKuliah24[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i < 3; i++) {
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

            arrayOfMataKuliah[i] = new MataKuliah24(kode, nama, sks, jumlahJam);
        }

        for (int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : "+ arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : "+ arrayOfMataKuliah[i].nama);
            System.out.println("Sks         : "+ arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : "+ arrayOfMataKuliah[i].jumlahJam);
            System.out.println("-----------------------------");

        }

        sc.close();
    }
}
