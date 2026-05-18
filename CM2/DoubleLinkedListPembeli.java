package CM2;

public class DoubleLinkedListPembeli {
    NodePembeli head;
    NodePembeli tail;

    public DoubleLinkedListPembeli() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli pembeli) {
        NodePembeli newNode = new NodePembeli(pembeli);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Pembeli removeFirst() {
        if (isEmpty()) {
            System.out.println("Daftar antrian kosong.");
            return null;
        }
        Pembeli removedPembeli = head.pembeli;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removedPembeli;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Daftar antrian kosong.");
            return;
        }

        System.out.println("================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("================================");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");

        NodePembeli current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.pembeli.noAntrian, current.pembeli.namaPembeli, current.pembeli.NoHp);
            current = current.next;
        }
    }
}
