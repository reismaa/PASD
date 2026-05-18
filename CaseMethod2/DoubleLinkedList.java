package CaseMethod2;

public class DoubleLinkedList {
    Node headPembeli;
    Node tailPembeli;
    Node headPesanan;
    Node tailPesanan;

    public DoubleLinkedList() {
        this.headPembeli = null;
        this.tailPembeli = null;
        this.headPesanan = null;
        this.tailPesanan = null;
    }

    public boolean isEmptyAntrian() {
        return headPembeli == null;
    }

    public void addLastPembeli(Pembeli pembeli) {
        Node newNode = new Node(pembeli);
        if (isEmptyAntrian()) {
            headPembeli = newNode;
            tailPembeli = newNode;
        } else {
            tailPembeli.next = newNode;
            newNode.prev = tailPembeli;
            tailPembeli = newNode;
        }
    }

    public Pembeli removeFirstPembeli() {
        if (isEmptyAntrian()) {
            System.out.println("Daftar antrian kosong.");
            return null;
        }
        Pembeli removedPembeli = headPembeli.pembeli;
        if (headPembeli == tailPembeli) {
            headPembeli = null;
            tailPembeli = null;
        } else {
            headPembeli = headPembeli.next;
            headPembeli.prev = null;
        }
        return removedPembeli;
    }

    public void printPembeli() {
        if (isEmptyAntrian()) {
            System.out.println("Daftar antrian kosong.");
            return;
        }

        System.out.println("================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("================================");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        Node current = headPembeli;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.pembeli.noAntrian, current.pembeli.namaPembeli, current.pembeli.NoHp);
            current = current.next;
        }
    }

    public boolean isEmptyPesanan() {
        return headPesanan == null;
    }

    public void addLastPesanan(Pesanan pesanan) {
        Node newNode = new Node(pesanan);
        if (isEmptyPesanan()) {
            headPesanan = newNode;
            tailPesanan = newNode;
        } else {
            tailPesanan.next = newNode;
            newNode.prev = tailPesanan;
            tailPesanan = newNode;
        }
    }

    public void sortByNamaPesanan() {
        if (headPesanan == null) {
            return;
        }

        boolean tukar;
        do {
            tukar = false;
            Node current = headPesanan;

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

    public void printPesanan() {
        if (isEmptyPesanan()) {
            System.out.println("Daftar pesanan kosong.");
            return;
        }

        sortByNamaPesanan();
        System.out.println("============================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("============================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        Node current = headPesanan;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            current = current.next;
        }
    }

}