package CaseMethod2;

public class Node {
    Pembeli pembeli;
    Pesanan pesanan;
    Node prev;
    Node next;

    Node(Pembeli pembeli) {
        this.pembeli = pembeli;
        this.pesanan = null;
        this.prev = null;
        this.next = null;
    }

    Node(Pesanan pesanan) {
        this.pembeli = null;
        this.pesanan = pesanan;
        this.prev = null;
        this.next = null;
    }
}
