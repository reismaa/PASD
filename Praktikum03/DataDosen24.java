package Praktikum03;

public class DataDosen24 {

    
    public void dataSemuaDosen(Dosen24[] arrayOfDosen) {
        int no = 1;
        for (Dosen24 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + 
                (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-----------------------------");
        }
    }

    
    public void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("-----------------------------");
    }

    
    public void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jmlPria++;
            } else {
                totalWanita += dosen.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jmlWanita));

        System.out.println("-----------------------------");
    }

    public void infoDosenPalingTua(Dosen24[] arrayOfDosen) {
        Dosen24 tertua = arrayOfDosen[0];

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Nama : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);
        System.out.println("-----------------------------");
    }

    
    public void infoDosenPalingMuda(Dosen24[] arrayOfDosen) {
        Dosen24 termuda = arrayOfDosen[0];

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
        System.out.println("-----------------------------");
    }
}