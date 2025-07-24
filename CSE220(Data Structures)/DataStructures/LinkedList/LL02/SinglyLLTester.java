import java.util.Scanner;
public class SinglyLLTester {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l=input.nextInt();
        int[] arr=new int[l];
        for(int i=0;i<l;i++){
            System.out.printf("Element %d: ",i+1);
            arr[i]=input.nextInt();
        }
        // 1. Creation of SinglyLL
        SinglyLL sll=new SinglyLL();
        sll.CreateLinkedListFromArray(arr);
        // 2. Printing of SinglyLL
        sll.printsll(sll.head);
        // 3. Counting of SinglyLL
        System.out.printf("The length of the linked list is %d\n",sll.count());
        // 4. Index of element in SinglyLL
        System.out.print("Enter the element to find its index: ");
        System.out.println("Your desired element is at "+sll.indexOf(input.nextInt())+" index.");
        // 5. Retrieve a node from an index
        System.out.print("Enter the index to find its element: ");
        System.out.println("Your index saves element: "+sll.getNode(input.nextInt()).elem);
        // 6. Update value in specific index
        System.out.print("Update the value of index: ");
        int idx=input.nextInt();
        System.out.print("Update the value with: ");
        int newVal=input.nextInt();
        sll.upValue(idx,newVal);
        sll.printsll(sll.head);
        // 7. Search element in specific index
        System.out.print("You want to search the element: ");
        int searchelement=input.nextInt();
        if(sll.searchElem(searchelement)) System.out.println("Found your searched element, that is: "+searchelement);
        else System.out.println("Not Found!!!");
        // 8. Insert a node in the list
        System.out.print("You want to insert the element: ");
        int insertelem=input.nextInt();
        System.out.print("You want to insert the element in index: ");
        int inserteleminidx=input.nextInt();
        sll.insert(inserteleminidx,insertelem);
        sll.printsll(sll.head);
        // 9. Remove a node from the list
        System.out.print("You want to remove the node in index: ");
        int removeNodeInIndex=input.nextInt();
        sll.remove(removeNodeInIndex);
        sll.printsll(sll.head);
        // 10. Copying a linked list
        sll.copy();
        sll.printsll(sll.newList.head);
        // 11. Out-of-place reverse of a linked list
        sll.reverseOutOfPlace();
        sll.printsll(sll.reversedList.head);
        // 12. In-place reverse of a linked list
        sll.reverseInPlace();
        sll.printsll(sll.head);
        sll.reverseInPlace();
        sll.printsll(sll.head);
        // 13. Rotating the list right
        System.out.print("Rotate the list to the right n time(s), n=");
        sll.rotateRight(input.nextInt());
        sll.printsll(sll.head);
        // 14. Rotating the list left
        System.out.print("Rotate the list to the left n time(s), n=");
        sll.rotateLeft(input.nextInt());
        sll.printsll(sll.head);
    }
}
