package CaseMethod2;

public class DoubleLinkedListPesanan {
    NodePesanan head;
    NodePesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan pesanan) {
        NodePesanan newNode = new NodePesanan(pesanan);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortByNamaPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;
        do {
            tukar = false;
            NodePesanan current = head;

            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareTo(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Daftar pesanan kosong.");
            return;
        }

        sortByNamaPesanan();
        System.out.println("============================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("============================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            current = current.next;
        }
    }
}
