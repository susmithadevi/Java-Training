package Day28;

public class BSTMaximum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMax(Node root) {

        while (root.right != null)
            root = root.right;

        return root.data;
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.right = new Node(90);

        System.out.println("Maximum = " + findMax(root));
    }
}
