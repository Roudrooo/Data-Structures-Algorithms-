public class BtTester {
    public static void main(String[] args){
        int[] arr={0,1,2,3,4,5,6,7};
        BinaryTree bt=new BinaryTree();
        bt.root=bt.createFromArray(arr,1);
        bt.InOrderTrav(bt.root);
        System.out.println();
        System.out.println("Depth of 6: " + bt.depth(bt.root, 6, 0));
        System.out.println("Total nodes:"+bt.count(bt.root));
    }
}



