import java.util.Scanner;

public class Tugas2 {
    static Scanner input = new Scanner(System.in);

    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Data Jadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();

            System.out.println();
        }
        
    }

    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n===== DAFTAR JADWAL KULIAH =====");
        System.out.printf("%-25s %-20s %-15s %-15s\n", 
                "Mata Kuliah", "Ruang", "Hari",  "Jam");
        System.out.println("-------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s\n",
                jadwal[i][0],
                jadwal[i][1],
                jadwal[i][2],
                jadwal[i][3]);
        }
        
    }

    public static void tampilBerdasarkanHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal [i][1] + " | " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void tamppilBerdasarMK(String[][] jadwal, int n, String mk) {
        System.out.println("\nJadwal Mata Kuliah: " + mk);
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari : " + jadwal[i][2]);
                System.out.println("Jam : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata Kuliah Tidak Ditemukan.");
        } 
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String cariHari = input.nextLine();
        tampilBerdasarkanHari(jadwal, n, cariHari);

        System.out.print("\nMasukkkan nama mata kuliah yang ingin dicari: ");
        String cariMK = input.nextLine();
        tamppilBerdasarMK(jadwal, n, cariMK);
    }

}
