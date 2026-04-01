package Praktikum05;

public class MahasiswaBerprestasi24 {
    Mahasiswa24[] listMhs;
    int idx;

    MahasiswaBerprestasi24(int kapasitas) {
        listMhs = new Mahasiswa24[kapasitas];
    }

    void tambah (Mahasiswa24 m) {
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil () {
        for (Mahasiswa24 m:listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("--------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i=0; i<listMhs.length-1; i++) {
            for (int j=1; j<listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa24 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i=0; i<listMhs.length-1; i++) {
            int idxMin=i;
            for (int j=i+1; j<listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa24 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

}
