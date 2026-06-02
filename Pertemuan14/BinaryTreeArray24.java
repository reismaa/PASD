package Pertemuan14;

public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray24() {
        this.dataMahasiswa = new Mahasiswa24[10];
        idxLast = -1;
    }

    void populateData (Mahasiswa24 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    //Tugas praktikum no. 4, menambah method add(mahasiswa data) dan traversePreOrder() 
    //method add(mahasiswa data) untuk memasukkan data ke dalam binary tree
    void add(Mahasiswa24 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Binary tree sudah penuh, tidak dapat menambahkan data baru.");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    //method traversePreOrder() 
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
            }
        }
    }
    
}
