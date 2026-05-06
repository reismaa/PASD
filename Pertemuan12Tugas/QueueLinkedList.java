package Pertemuan12Tugas;

public class QueueLinkedList {
    Node front;
    Node rear;
    int size;
    int max;

    public QueueLinkedList(int max) {
        this.max = max;
        this.size = 0;
        front = rear = null;
    }
    
    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node newNode = new Node(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampilkanData();
            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void jumlah() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            Node temp = front;
            System.out.println("Isi antrian:");
            while (temp != null) {
                temp.data.tampilkanData();
                temp = temp.next;
            }
        }
    }
}
