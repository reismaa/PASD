package CaseMethod1;

import java.util.Scanner;

public class SistemPeminjamanMain {
    static void tampilMenu() {
        System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
    }

    static void tampilMahasiswa(Mahasiswa[] mhs) {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : mhs) {
            m.tampilMahasiswa();
        }
    }

    static void tampilBuku(Buku[] buku) {
        System.out.println("\nDaftar Buku: ");
        for (Buku b : buku) {
            b.tampilBuku();
        }
    }

    static void tampilPeminjaman(Peminjaman[] peminjaman) {
        System.out.println("\nData Peminjaman: ");
        for (Peminjaman pin : peminjaman) {
            pin.tampilPeminjaman();
        }
    }

    // Insertion sort berdasarkan denda terbesar
    static void sortDenda(Peminjaman[] p) {
        for (int i = 1; i < p.length; i++) {
            Peminjaman key = p[i];
            int j = i - 1;
            while (j >= 0 && p[j].denda < key.denda) {
                p[j + 1] = p[j];
                j--;
            }
            p[j + 1] = key;
        }
    }

    static void cariNIM(Peminjaman[] p, String nim) {
        boolean ketemu = false;
        for (Peminjaman pin : p) {
            if (pin.mhs.nim.equals(nim)) {
                pin.tampilPeminjaman();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mhs = {
            new Mahasiswa("22001","Andi","Teknik Informatika"),
            new Mahasiswa("22002","Budi","Teknik Informatika"),
            new Mahasiswa("22003","Citra","Sistem Informasi Bisnis")
        };

        Buku[] buku = {
            new Buku("B001","Algoritma",2020),
            new Buku("B002","Basis Data",2019),
            new Buku("B003","Pemrograman",2021),
            new Buku("B004","Fisika",2024)
        };

        Peminjaman[] pinjam = {
            new Peminjaman(mhs[0], buku[0],7),
            new Peminjaman(mhs[1], buku[1],3),
            new Peminjaman(mhs[2], buku[2],10),
            new Peminjaman(mhs[2], buku[3],6),
            new Peminjaman(mhs[0], buku[1],4)
        };

        int pilih;
        do {
            tampilMenu();
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    tampilMahasiswa(mhs);
                    break;
                case 2:
                    tampilBuku(buku);
                    break;
                case 3:
                    tampilPeminjaman(pinjam);
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    sortDenda(pinjam);
                    for (Peminjaman p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String nim = sc.nextLine();
                    cariNIM(pinjam, nim);
                    break;
            }
        } while (pilih != 0);

        System.out.println("Program selesai.");

        sc.close();
    }
    
}
