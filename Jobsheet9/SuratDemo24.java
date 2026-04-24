package Jobsheet9;

import java.util.Scanner;

public class SuratDemo24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat24 stack = new StackSurat24(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1: // Terima Surat Izin
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();

                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    System.out.print("Jenis Izin: ");
                    String inputJenis = scan.nextLine();
                    if (inputJenis.length() != 1) {
                        System.out.println("Jenis izin harus berupa satu karakter (S atau I)!");
                        break;
                    }
                    char jenisIzin = inputJenis.charAt(0);
                    if (jenisIzin != 'S' && jenisIzin != 'I') {
                        System.out.println("Jenis izin harus S (Sakit) atau I (Izin)!");
                        scan.nextLine();
                        break;
                    }

                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat24 surat = new Surat24(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin berhasil diterima.");
                    break;

                case 2: // Proses Surat Izin
                    Surat24 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat izin dari " + diproses.namaMahasiswa);
                    }
                    break;

                case 3: // Lihat Surat Izin Terakhir
                    Surat24 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir diajukan oleh " + lihat.namaMahasiswa);
                    }
                    break;

                case 4: // Cari Surat
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}