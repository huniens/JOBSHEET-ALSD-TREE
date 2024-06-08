public class BinaryTreeArray12 {
    int[] data;
    int idxLast;

    public BinaryTreeArray12() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traversalInOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traversalInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traversalInOrder(2 * idxStart + 2);
        }
    }
}
