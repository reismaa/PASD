import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMK = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 2, 3, 2, 3, 2, 2};

        double[] nilaiAngka = new double[namaMK.length];
        String[] nilaiHuruf = new String[namaMK.length];
        double[] nilaiSetara = new double[namaMK.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i]= 2.0;
            } else if  (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-35s %-12s %-12s %-10s\n",
                        "MK", "Nilai Angka", "Nilai Huruf", "Bobot");

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < namaMK.length; i++) {
            double bobot = nilaiSetara[i] * sks[i];
            totalBobot += bobot;
            totalSKS += sks[i];

            System.out.printf("%-35s %-12.2f %-12s %-10.2f\n", 
                            namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        double ip = totalBobot / totalSKS;

        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    }
}
