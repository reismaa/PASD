package Jobsheet9;

public class StackSurat24 {
    Surat24[] stack;
    int top;
    int size;

    public StackSurat24(int size) {
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(Surat24 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat24 pop() {
        if (!isEmpty()) {
            Surat24 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat24 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang diajukan");
            return null;
        }
    }
    
    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("\nSurat Ditemukan");
                System.out.println("ID Surat: " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa: " + stack[i].namaMahasiswa);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis Izin: " + stack[i].jenisIzin);
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
    
}
