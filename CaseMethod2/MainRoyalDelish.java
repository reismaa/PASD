package CaseMethod2;

import java.util.Scanner;

public class MainRoyalDelish {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedListPembeli antrian = new DoubleLinkedListPembeli();
        DoubleLinkedListPesanan daftarPesanan = new DoubleLinkedListPesanan();
        int noAntrian = 1;
        int pilihan;

        do {
            System.out.println("\n================================");
            System.out.println(" SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli  : ");
                    String namaPembeli = scan.nextLine();
                    System.out.print("No HP         : ");
                    String noHP = scan.nextLine();
                    Pembeli p = new Pembeli(noAntrian, namaPembeli, noHP);
                    antrian.addLast(p);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
                    noAntrian++;
                    break;
                
                case 2:
                    antrian.print();
                    break;
                
                case 3:
                    Pembeli dilayani = antrian.removeFirst();
                    if (dilayani != null) {
                        System.out.print("Kode Pesanan  : ");
                        int kodePesanan = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = scan.nextLine();
                        System.out.print("Harga         : ");
                        int harga = scan.nextInt();
                        scan.nextLine();

                        Pesanan pesanan = new Pesanan(kodePesanan, namaPesanan, harga);
                        daftarPesanan.addLast(pesanan);

                        System.out.println(dilayani.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;

                case 4:
                    daftarPesanan.print();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilihan != 0);
        scan.close();
    }
    
}
