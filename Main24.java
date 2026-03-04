import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Perpustakaan24 perpus = new Perpustakaan24();
        int pilih;

        do {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswwa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan kode buku: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulis = sc.nextLine();
                    
                    perpus.tambahBuku(new Buku24(kode, judul, penulis));
                    break;
                
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();

                    perpus.tambahMahasiswa(new Mahasiswa24(nim, nama));
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Kode Buku: ");
                    kode = sc.nextLine();

                    Mahasiswa24 mhs = perpus.cariMahasiwa(nim);
                    Buku24 buku = perpus.cariBuku(kode);

                    if (mhs != null && buku != null) {
                        mhs.pinjamBuku(buku);
                    } else {
                        System.out.println("Mahasiswa atau Buku tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Kode Buku: ");
                    kode = sc.nextLine();

                    mhs = perpus.cariMahasiwa(nim);
                    if (mhs != null) {
                        boolean berhasil = mhs.kembalikanBuku(kode);

                        if (berhasil) {
                            System.out.println("Buku berhasil dikembalikan!");
                        } else {
                            System.out.println("Buku tidak ditemukand alam daftar pinjaman.");
                        }
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan!");
                    }
                    break;

                case 5:
                    perpus.tampilkanDaftarPeminjaman();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
            
                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 6);

        sc.close();
    }

}
