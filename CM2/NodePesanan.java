package CM2;

public class NodePesanan {
    Pesanan pesanan;
    NodePesanan prev;
    NodePesanan next;

    public NodePesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
        this.prev = null;
        this.next = null;
    }
}
