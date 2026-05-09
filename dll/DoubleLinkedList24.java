package dll;

public class DoubleLinkedList24 {
    Node24 head;
    Node24 tail;
    int size;

    public DoubleLinkedList24() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa24 data) {
        Node24 newNode = new Node24(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa24 data) {
        Node24 newNode = new Node24(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Tugas nomor 1. Menambahkan method add() untuk menambahkan node pada indeks tertentu 
    public void add(int index, Mahasiswa24 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0){
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }
        Node24 current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node24 newNode = new Node24(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;

        System.out.println("Data berhasil ditambahkan pada index " + index);
    }

    // Method removeFirst
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa24 dataHapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;

        System.out.println("Data sudah berhasil dihapus.");
        System.out.println("Data yang terhapus adalah: ");
        dataHapus.tampil();
    }

    // Method removeLast
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa24 dataHapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;

        System.out.println("Data sudah berhasil dihapus.");
        System.out.println("Data yang terhapus adalah: ");
        dataHapus.tampil();
    }

    // Tugas nomor 2. Menambahkan method removeAfter() untuk menghapus node setelah data key
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Node24 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah key tidak ditemukan.");
            return;
        }
        Node24 deleted = current.next;
        if (deleted == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = deleted.next;
            deleted.next.prev = current;
        }
        size--;

        System.out.println("Data setelah " + keyNim + " berhasil dihapus.");
        deleted.data.tampil();
    }

    // Tugas nomor 3. Menambahkan method remove() untuk menghapus node pada indeks tertentu
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        
        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node24 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;

        System.out.println("Data pada index " + index + " berhasil dihapus.");
        current.data.tampil();
    }

    // Method search
    public Node24 search(String nim) {
        Node24 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null; // Tidak ditemukan
    }

    // Tugas nomor 4. Menambahkan method getFirst(), getLast(), dan getIndex()
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data pertama:");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data terakhir:");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        Node24 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }

    // Tugas nompr 5. Menambahkan kode program dan fungsi agar dapat membaca size/ jumlah data 
    public int size() {
        return size;
    }

    public void insertAfter(String keyNim, Mahasiswa24 data) {
        Node24 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node24 newNode = new Node24(data);

        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }

        Node24 current = head;
        while (current != null) {
            current.data.tampil();
            current =current.next;
        }
        System.out.println("Jumlah data: " + size);
    }
    
}
