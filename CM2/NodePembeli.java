package CM2;

public class NodePembeli {
    Pembeli pembeli;
    NodePembeli prev;
    NodePembeli next;

    public NodePembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
        this.prev = null;
        this.next = null;
    }
}
