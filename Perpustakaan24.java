public class Perpustakaan24 {
    Buku24[] daftarBuku = new Buku24[100];
    Mahasiswa24[] daftarMahasiswa = new Mahasiswa24[100];
    int jumlahBuku = 0;
    int jumlahMahasiswa = 0;

    public void tambahBuku(Buku24 buku) {
        daftarBuku[jumlahBuku] = buku;
        jumlahBuku++;
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tambahMahasiswa(Mahasiswa24 mhs) {
        daftarMahasiswa[jumlahMahasiswa] = mhs;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public Buku24 cariBuku(String kode) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].kodeBuku.equals(kode)) {
                return daftarBuku[i];
            }
        }
        return null;
    }

    public Mahasiswa24 cariMahasiwa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    public void prosesPinjam(String nim, String kodeBuku) {
        Mahasiswa24 mhs = cariMahasiwa(nim);
        Buku24 buku = cariBuku(kodeBuku);

        if (mhs != null && buku != null) {
            if (!buku.statusPeminjaman) {
                buku.statusPeminjaman = true;
                System.out.println("Peminjaman buku berhasil.");
            } else {
                System.out.println("Gagal: Buku sedang dipinjam.");
            }
        }
    }

    public void prosesKembali(String nim, String kodeBuku) {
        Mahasiswa24 mhs = cariMahasiwa(nim);
        Buku24 buku = cariBuku(kodeBuku);

        if (mhs != null && buku != null) {
            if (mhs.kembalikanBuku(kodeBuku)) {
                buku.statusPeminjaman = false;
                System.out.println("Pengembalian buku berhasil.");
            } else {
                System.out.println("Gagal: Buku tidak ditemukan pada mahasiswa.");
            }
        }
    }

    public void tampilkanDaftarPeminjaman() {
        System.out.println("\n ----- Daftar Peminjaman Buku ----- ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            daftarMahasiswa[i].tampilkanPinjaman();
        }
    }

}
