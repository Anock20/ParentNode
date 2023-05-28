public class BinaryTree {
    private Object root;
    private BinaryTree left, right;

    public BinaryTree(Object root) {

        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this(root);
        if (left != null)
            this.left = left;
        if (right != null)
            this.right = right;
    }

    public BinaryTree(BinaryTree that) {

        this.root = that.root;
        if (that.left != null)
            this.left = new BinaryTree(that.left);
        if (that.right != null)
            this.right = new BinaryTree(that.right);
    }

    public int pathLength() {
        if (left == null && right == null)
            return 0;
        if (left == null)
            return right.pathLength() + right.size();
        if (right == null)
            return left.pathLength() + left.size();
        return left.pathLength() + right.pathLength() + size() - 1;
    }

    public int size() {
        if (left == null && right == null)
            return 1;
        if (left == null)
            return 1 + right.size();
        right.size();
        if (right == null)
            return 1 + left.size();
        return 1 + left.size() + right.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (left != null)
            sb.append(left + ",");
        sb.append(root);
        if (right != null)
            sb.append("," + right);
        return sb + "]";
    }
    public boolean parent(Object x) { //각 root를 x와 비교해서 같으면 true
        if ((left != null && left.root.equals(x)) || (right != null && right.root.equals(x))) {
            System.out.print(root);
            return true;
        }
        if (left != null && left.parent(x)) {
            return true;
        }
        if (right != null && right.parent(x)) {
            return true;
        }
        return false;
    }

}

