package Praktikum05;

public class MahasiswaDemo24 {
    
    public static void main(String[] args) {
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();
        Mahasiswa24 m1 = new Mahasiswa24("123", "Zidan", "2A", 3.2);
        Mahasiswa24 m2 = new Mahasiswa24("124", "Ayu", "2A", 3.5);
        Mahasiswa24 m3 = new Mahasiswa24("125", "Sofi", "2A", 3.1);
        Mahasiswa24 m4 = new Mahasiswa24("126", "Sita", "2A", 3.9);
        Mahasiswa24 m5 = new Mahasiswa24("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
    
}
