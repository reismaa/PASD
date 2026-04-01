package Praktikum05;

import java.util.Scanner;

public class DosenMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen24 list = new DataDosen24();

        int pilih;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DESC (Usia Tertua ke Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    
                    System.out.print("Kode Dosen : ");
                    String kode = sc.nextLine();

                    System.out.print("Nama Dosen : ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (true=Laki, false=Perempuan): ");
                    boolean jk = sc.nextBoolean();

                    System.out.print("Usia : ");
                    int usia = sc.nextInt();

                    Dosen24 dsn = new Dosen24(kode, nama, jk, usia);
                    list.tambah(dsn);
                    break;

                case 2:
                    list.tampil();
                    break;
                
                case 3:
                    list.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DESC");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;
            
                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);

        sc.close();
    }
    
}
