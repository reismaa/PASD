public class Mahasiswa24 {
    
    String nim;
    String nama;
    Buku24[] bukuDipinjam;
    int jumlahPinjam;

    public Mahasiswa24(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        bukuDipinjam = new Buku24[2];
        jumlahPinjam = 0;
    }

    public boolean pinjamBuku(Buku24 buku) {

    if (jumlahPinjam >= 2) {
        System.out.println("Gagal! " + nama + " sudah meminjam 2 buku.");
        return false;
    }

    if (buku.statusPeminjaman) {
        System.out.println("Gagal meminjam buku: " + buku.judulBuku + 
                " karena sudah dipinjam orang lain.");
        return false;
    }

    bukuDipinjam[jumlahPinjam] = buku;
    jumlahPinjam++;
    buku.statusPeminjaman = true;

    System.out.println(nama + " berhasil meminjam " + buku.judulBuku);
    return true;
}

    public boolean kembalikanBuku(String kodeBuku) {
        for (int i = 0; i < jumlahPinjam; i++) {
            if (bukuDipinjam[i].kodeBuku.equals(kodeBuku)) {
                bukuDipinjam[i].statusPeminjaman = false;

                for (int j = i; j < jumlahPinjam - 1; j++) {
                    bukuDipinjam[j] = bukuDipinjam[j + 1];
                }

                bukuDipinjam[jumlahPinjam - 1] = null;
                jumlahPinjam--;

                System.out.println(nama + " berhasil mengembalikan buku.");
                return true;
            }
        }

        System.out.println("Buku tidak ditemukan dalam daftar pinjaman.");
        return false;
    }

    public void tampilkanPinjaman() {
        if (jumlahPinjam > 0) {
            System.out.print("Mahasiswa: " + nama + " (" + nim + ")");
            for (int i = 0; i < jumlahPinjam; i++) {
                System.out.println(bukuDipinjam[i].judulBuku + " ");
            }
            System.out.println();
        }
    }
}
