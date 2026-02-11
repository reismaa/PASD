public class RoyalGarden {
    
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASSIA = 60000;
    static final int HARGA_MAWAR = 10000;

    public static int hitungPendapatan (int algonema, int keladi, int alocasia, int mawar) {
        return (algonema * HARGA_AGLONEMA) + (keladi * HARGA_KELADI) + (alocasia * HARGA_ALOCASSIA) + (mawar * HARGA_MAWAR); 
    }

    public static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        int [][] stok = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        String[] namaCabang = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4",
        };

        System.out.println("Pendapatan RoyalGarden");
        System.out.println("==============================");

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(
                stok[i][0],
                stok[i][1],
                stok[i][2],
                stok[i][3]
            );

            String status = tentukanStatus(pendapatan);

            System.out.println(namaCabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("------------------------------------");
        }

    }
}
