package Day29;

import java.util.*;

public class CloneGraph {

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }

    static class Solution {

        HashMap<Node, Node> map = new HashMap<>();

        public Node cloneGraph(Node node) {

            if (node == null)
                return null;

            if (map.containsKey(node))
                return map.get(node);

            Node copy = new Node(node.val);
            map.put(node, copy);

            for (Node nei : node.neighbors) {
                copy.neighbors.add(cloneGraph(nei));
            }

            return copy;
        }
    }

    public static void main(String[] args) {
        System.out.println("Create graph manually to test.");
    }
}
