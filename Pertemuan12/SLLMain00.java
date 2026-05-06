package Pertemuan12;

import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList24 sll = new SingleLinkedList24();

        Mahasiswa24 mhs1 = new Mahasiswa24("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa24 mhs2 = new Mahasiswa24("23212201", "Bimon", "2B", 3.8);
        Mahasiswa24 mhs3 = new Mahasiswa24("22212202", "Cintia", "3C", 3.5);
        Mahasiswa24 mhs4 = new Mahasiswa24("21212203", "Dirga", "4D", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        Scanner sc = new Scanner(System.in); //Modifikasi input keyboard

        System.out.print("Masukkan NIM      : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama     : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas    : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK      : ");
        Double ipk = sc.nextDouble();

        Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas, ipk);
        sll.addLast(mhs);
        sll.print();

        sc.close();
    }
}
