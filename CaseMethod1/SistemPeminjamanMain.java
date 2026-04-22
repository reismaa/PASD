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
        System.out.println("6. Tambah Data Peminjaman Baru");
        System.out.println("7. Tampilkan Statistik");
        System.out.println("0. Keluar");
    }

    static void tampilMahasiswa(Mahasiswa[] mhs) {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : mhs) {
            m.tampilMahasiswa();
        }
    }

    static void tampilBuku(Buku[] buku) {
        System.out.println("\nDaftar Buku:");
        for (Buku b : buku) {
            b.tampilBuku();
        }
    }

    static void tampilPeminjaman(Peminjaman[] peminjaman) {
        System.out.println("\nData Peminjaman:");
        for (Peminjaman pin : peminjaman) {
            pin.tampilPeminjaman();
        }
    }

    // INSERTION SORT BERDASARKAN DENDA TERBESAR
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

    // SORT BERDASARKAN NIM (ASCENDING)
    static void sortNIM(Peminjaman[] p) {
        for (int i = 1; i < p.length; i++) {

            Peminjaman key = p[i];
            int j = i - 1;

            while (j >= 0 && p[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                p[j + 1] = p[j];
                j--;
            }

            p[j + 1] = key;
        }
    }

    // BINARY SEARCH NIM
    static void binarySearchNIM(Peminjaman[] p, String nim) {

        int left = 0;
        int right = p.length - 1;
        int mid;
        int index = -1;

        while (left <= right) {

            mid = (left + right) / 2;

            int hasil = p[mid].mhs.nim.compareTo(nim);

            if (hasil == 0) {
                index = mid;
                break;
            } 
            else if (hasil < 0) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        if (index == -1) {
            System.out.println("Data tidak ditemukan!");
            return;
        }

        System.out.println("[Binary Search] Data ditemukan:");

        int i = index;

        while (i >= 0 && p[i].mhs.nim.equals(nim)) {
            p[i].tampilPeminjaman();
            i--;
        }

        i = index + 1;

        while (i < p.length && p[i].mhs.nim.equals(nim)) {
            p[i].tampilPeminjaman();
            i++;
        }
    }

    // CARI MAHASISWA
    static Mahasiswa cariMahasiswa(Mahasiswa[] mhs, String nim) {
        for (Mahasiswa m : mhs) {
            if (m.nim.equals(nim)) {
                return m;
            }
        }
        return null;
    }

    // CARI BUKU
    static Buku cariBuku(Buku[] buku, String kode) {
        for (Buku b : buku) {
            if (b.kode.equals(kode)) {
                return b;
            }
        }
        return null;
    }

    // MENU 6 TAMBAH PEMINJAMAN
    static Peminjaman[] tambahPeminjaman(Peminjaman[] pinjam, Mahasiswa[] mhs, Buku[] buku, Scanner sc) {

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        Mahasiswa m = cariMahasiswa(mhs, nim);

        if (m == null) {
            System.out.println("NIM tidak ditemukan!");
            return pinjam;
        }

        System.out.print("Masukkan Kode Buku: ");
        String kode = sc.nextLine();

        Buku b = cariBuku(buku, kode);

        if (b == null) {
            System.out.println("Kode buku tidak ditemukan!");
            return pinjam;
        }

        System.out.print("Masukkan Lama Pinjam: ");
        int lama = sc.nextInt();
        sc.nextLine();

        Peminjaman baru = new Peminjaman(m, b, lama);

        Peminjaman[] temp = new Peminjaman[pinjam.length + 1];

        for (int i = 0; i < pinjam.length; i++) {
            temp[i] = pinjam[i];
        }

        temp[pinjam.length] = baru;

        System.out.println("Data peminjaman berhasil ditambahkan!");

        return temp;
    }

    // MENU 7 STATISTIK
    static void tampilStatistik(Peminjaman[] pinjam) {

        int totalDenda = 0;
        int jumlahTerlambat = 0;
        int jumlahTepat = 0;

        for (Peminjaman p : pinjam) {

            totalDenda += p.denda;

            if (p.terlambat > 0) {
                jumlahTerlambat++;
            } 
            else {
                jumlahTepat++;
            }
        }

        System.out.println("\n=== STATISTIK PEMINJAMAN ===");
        System.out.println("Total Denda Keseluruhan: Rp " + totalDenda);
        System.out.println("Jumlah Peminjaman Terlambat: " + jumlahTerlambat);
        System.out.println("Jumlah Peminjaman Tepat Waktu: " + jumlahTepat);
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
                    System.out.println("\nSetelah diurutkan dengan Insertion Sort (Denda terbesar):");
                    sortDenda(pinjam);
                    for (Peminjaman p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String nim = sc.nextLine();
                    Peminjaman[] copy = new Peminjaman[pinjam.length];
                    for (int i = 0; i < pinjam.length; i++) {
                        copy[i] = pinjam[i];
                    }
                    sortNIM(copy);
                    binarySearchNIM(copy, nim);
                    break;
                case 6:
                    pinjam = tambahPeminjaman(pinjam, mhs, buku, sc);
                    break;
                case 7:
                    tampilStatistik(pinjam);
                    break;
            }
        } while (pilih != 0);
        System.out.println("Program selesai.");
        sc.close();

    }
    
}