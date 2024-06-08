class BinaryTree12 {
    Node12 root;

    static class Node12 {
        int value;
        Node12 left, right;

        Node12(int item) {
            value = item;
            left = right = null;
        }
    }

    // Constructor
    BinaryTree12() {
        root = null;
    }

    // Method to add a node recursively
    void add(int value) {
        root = addRecursive(root, value);
    }

    Node12 addRecursive(Node12 current, int value) {
        if (current == null) {
            return new Node12(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    // Method to find the minimum value in the tree
    int findMinValue(Node12 node) {
        if (node.left != null) {
            return findMinValue(node.left);
        }
        return node.value;
    }

    // Method to find the maximum value in the tree
    int findMaxValue(Node12 node) {
        if (node.right != null) {
            return findMaxValue(node.right);
        }
        return node.value;
    }

    // Method to print the minimum and maximum values
    void printMinMax() {
        System.out.println("Minimum value: " + findMinValue(root));
        System.out.println("Maximum value: " + findMaxValue(root));
    }

    // Method to print leaf nodes
    void printLeafNodes(Node12 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.value + " ");
            }
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }

    void printLeaves() {
        System.out.print("Leaf nodes: ");
        printLeafNodes(root);
        System.out.println();
    }

    // Method to count the number of leaf nodes
    int countLeaves(Node12 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeaves(node.left) + countLeaves(node.right);
        }
    }

    int getLeafCount() {
        return countLeaves(root);
    }
}
