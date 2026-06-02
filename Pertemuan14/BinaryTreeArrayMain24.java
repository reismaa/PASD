package Pertemuan14;

public class BinaryTreeArrayMain24 {
    public static void main(String[] args) {

        BinaryTreeArray24 bta = new BinaryTreeArray24();

        Mahasiswa24 mhs1 = new Mahasiswa24("244160121", "Ali", "A", 3.57);
        Mahasiswa24 mhs2 = new Mahasiswa24("244160185", "Candra", "C", 3.41);
        Mahasiswa24 mhs3 = new Mahasiswa24("244160221", "Badar", "B", 3.75);
        Mahasiswa24 mhs4 = new Mahasiswa24("244160220", "Dewi", "B", 3.35);

        Mahasiswa24 mhs5 = new Mahasiswa24("244160131", "Devi", "A", 3.48);
        Mahasiswa24 mhs6 = new Mahasiswa24("244160205", "Ehsan", "D", 3.61);
        Mahasiswa24 mhs7 = new Mahasiswa24("244160170", "Fizi", "B", 3.86);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nPreorder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
    
}
