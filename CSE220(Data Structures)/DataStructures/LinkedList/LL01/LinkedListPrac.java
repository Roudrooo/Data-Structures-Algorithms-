public class LinkedListPrac {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        SinglyLinkedList list=new SinglyLinkedList();

        // 1. Creation
        list.CreateLinkedListFromArray(arr);

        // 2. Iteration
        System.out.println("Original List:");
        list.Iterate();
        System.out.println("\n");

        // 3. Count
        System.out.println("Total number of item in the list = "+list.count()+"\n");

        // 4. nodeAt
        int nodeelem=list.nodeAt(4);
        if(nodeelem==-1) System.out.println("NO ELEMENT FOUND!!!");
        else System.out.println("EMELENT FOUND "+nodeelem);
    }
}