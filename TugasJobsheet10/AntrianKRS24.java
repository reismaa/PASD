package TugasJobsheet10;

public class AntrianKRS24 {
    Mahasiswa24[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahDilayani = 0;
    final int MAX_DILAYANI = 30;

    public AntrianKRS24(int max) {
        this.max = max;
        this.data = new Mahasiswa24[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Mahasiswa24 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian.");
    }

    // melayani 2 mahasiswa
    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }
        System.out.println("Memproses 2 mahasiswa: ");
        for (int i = 0; i < 2; i++) {
            Mahasiswa24 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahDilayani++;
        }
    }

    public void tampilSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        for (int i = 0; i < size; i++) {
            int idx = (front + 1) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void tampil2Terdepan() {
        if (size  < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan: ");
        for (int i = 0; i < 2; i++) {
            int idx = (front + 1) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahDilayani() {
        return sudahDilayani;
    }

    public int sisaBelumKRS() {
        return MAX_DILAYANI - sudahDilayani;
    }
    
}
