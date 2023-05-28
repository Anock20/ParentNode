
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree treeH = new BinaryTree("H");
        BinaryTree treeI = new BinaryTree("I");
        BinaryTree treeJ = new BinaryTree("J");
        BinaryTree treeK = new BinaryTree("K");
        BinaryTree treeE = new BinaryTree("E");
        BinaryTree treeG = new BinaryTree("G");
        BinaryTree treeD = new BinaryTree("D", treeH, treeI);
        BinaryTree treeF = new BinaryTree("F", treeJ, treeK);
        BinaryTree treeB = new BinaryTree("B", treeD, treeE);
        BinaryTree treeC = new BinaryTree("C", treeF, treeG);
        BinaryTree treeA = new BinaryTree("A", treeB, treeC);
        treeA.parent("B");
        System.out.println();
        treeA.parent("F");
        System.out.println();
        treeA.parent("I");

    }
}
