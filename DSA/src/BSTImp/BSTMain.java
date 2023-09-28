package BSTImp;
public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        System.out.println("Root==>"+tree.root);
       // tree.insert(99);
        tree.insert(47);
        tree.insert(21);
        tree.insert(76);
        tree.insert(18);
        tree.insert(55);
        tree.insert(5);
        System.out.println("Root==>"+tree.root.value);
        System.out.println("Contains="+tree.contains(21));
        System.out.println("rContains="+tree.rContains(21));
        tree.rInsert(7);
       // System.out.println(tree.root.left.left .left.value);
        System.out.println("Contains="+tree.contains(7));


    }
}
