public class BinaryTree {
    BiTreeNode root;

    // 1. Create a binary tree from array (ignoring index 0)
    public BiTreeNode createFromArray(int[] arr, int i){
        BiTreeNode root=null;
        if(i>0&&i<arr.length){
            if(arr[i]!=0){
                root=new BiTreeNode((Integer)arr[i]);
                root.left=createFromArray(arr, 2*i);
                root.right=createFromArray(arr, 2*i+1);
            }
        }
        return root;
    }

    // 2. Traversal
    public void InOrderTrav(BiTreeNode root){
        if(root!=null){
            InOrderTrav(root.left);
            System.out.print(root.elem+" ");
            InOrderTrav(root.right);
        }
    }


    // 3. Depth of a node
    public int depth(BiTreeNode root, int target, int i){
        if(root==null) return -1;
        if((Integer)root.elem==target) return i;
        int left=depth(root.left,target,i+1);
        if(left!=-1) return left;
        return depth(root.right,target,i+1);
    }


    // 4. Number of Nodes
    public int count(BiTreeNode root){
        if(root==null) return 0;
        return 1+count(root.left)+count(root.right);
    }


    // 5. 
}
