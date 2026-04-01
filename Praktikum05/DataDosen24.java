package Praktikum05;

public class DataDosen24 {

    Dosen24[] dataDosen = new Dosen24[10];
    int idx;

    void tambah(Dosen24 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    //Bubble Sort ASC (termuda ke tertua)
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {

                if (dataDosen[j].usia > dataDosen[j + 1].usia) {

                    Dosen24 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    //Sorting DSC (tertua ke termuda)
    void sortingDSC() {
        insertionSort();
    }

    //Insertion Sort DESC 
    void insertionSort() {

        for (int i = 1; i < idx; i++) {
            Dosen24 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
