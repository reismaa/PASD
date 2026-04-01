package Praktikum05;

public class MahasiswaBerprestasi24 {
    Mahasiswa24 [] listMhs= new Mahasiswa24 [5];
    int idx;

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
            m.tampilInformasi();
            System.out.println("--------------------------");
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

}
