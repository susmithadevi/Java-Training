package Day28;

public class BSTMinimum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMin(Node root) {

        while (root.left != null)
            root = root.left;

        return root.data;
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);

        System.out.println("Minimum = " + findMin(root));
    }
}
