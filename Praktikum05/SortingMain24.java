package Praktikum05;

public class SortingMain24 {

    public static void main(String[] args) {
        
        int a[]= {20, 10, 2, 7, 12};

        Sorting24 dataurut1 = new Sorting24(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[]= {30, 20, 2, 8, 14};

        Sorting24 dataurut2 = new Sorting24(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

    }
}
