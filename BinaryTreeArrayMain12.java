public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {
        // Uji class BinaryTree12
        BinaryTree12 tree = new BinaryTree12();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        System.out.println("Minimum and Maximum values:");
        tree.printMinMax();

        System.out.println("Leaf nodes:");
        tree.printLeaves();

        System.out.println("Number of leaf nodes: " + tree.getLeafCount());

        // Uji class BinaryTreeArray12
        BinaryTreeArray12 bta = new BinaryTreeArray12();
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        
        System.out.print("\nInOrder Traversal: ");
        bta.traversalInOrder(0);
        System.out.print("\nPreOrder Traversal: ");
        bta.traversePreOrder(0);
        System.out.print("\nPostOrder Traversal: ");
        bta.traversePostOrder(0);
        System.out.println();
    }
}