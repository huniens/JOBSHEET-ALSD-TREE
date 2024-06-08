public class BinaryTreeMain12 {
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree12 tree = new BinaryTree12();
        
        // Add nodes to the tree
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        // Print minimum and maximum values
        System.out.println("Minimum and Maximum values:");
        tree.printMinMax();

        // Print leaf nodes
        System.out.println("Leaf nodes:");
        tree.printLeaves();

        // Print number of leaf nodes
        System.out.println("Number of leaf nodes: " + tree.getLeafCount());
    }
}