

public class SinglyLL{
    public Node head;
    // 1. Creation of SinglyLL
    public void CreateLinkedListFromArray(int[] arr){
        if(arr==null||arr.length==0) return;
        head=new Node(arr[0]);
        Node tail=head;
        for(int i=1;i<arr.length;i++){
            Node n=new Node(arr[i]);
            tail.next=n;
            tail=tail.next;
        }
    }
    // 2. Printing of SinglyLL
    public Node printsll(Node head){
        Node tail=head;
        while(tail!=null){
            System.out.print(tail.elem);
            if(tail.next!=null) System.out.print("-->");
            tail=tail.next;
        }
        System.out.println();
        return head;
    }
    // 3. Counting of SinglyLL
    int count=0;
    public int count(){
        if(head==null) return count;
        Node tail=head;
        while(tail!=null){
            count++;
            tail=tail.next;
        }
        return count;
    }
    // 4. Index of element in SinglyLL
    public int indexOf(int elem){
        if(head==null) return -1;
        Node tail=head;
        int index=0;
        while(tail!=null){
            if((int)tail.elem==elem) return index;
            index++;
            tail=tail.next;
        }
        return -1;
    }
    // 5. Retrieve a node from an index
    public Node getNode(int index){
        Node tail=head;
        int idx=0;
        while(tail!=null){
            if(idx==index) return tail;
            idx++;
            tail=tail.next;
        }
        return null;
    }
    // 6. Update value in specific index
    public void upValue(int index, int newVal){
        Node nodeToUp=getNode(index);
        if(nodeToUp!=null){
            nodeToUp.elem=newVal;
            System.out.println("Your given value is updated.");
        }else{
            System.out.println("Couldn't update your given value.");
        }
    }
    // 7. Search element in specific index
    public boolean searchElem(int elem){
        if(head==null) return false;
        Node tail=head;
        while(tail!=null){
            if((int)tail.elem==elem){
                return true;
            }
            tail=tail.next;
        }
        return false;
    }
    // 8. Insert a node in the list
    public void insert(int index, int elem){
        Node newNode=new Node(elem);
        if(index==0){ // Insert at the beginning
            newNode.next=head;
            head=newNode;
        }
        Node prev=getNode(index-1);
        if(prev!=null){ // Insert in the middle or at the end
            newNode.next=prev.next;
            prev.next=newNode;
        }
    }
    // 9. Remove a node from the list
    public void remove(int index){
        if(head==null) return;
        if(index==0){ // Remove from the beginning
            head=head.next;
            return;
        }
        Node prev=getNode(index-1);
        if(prev!=null){ // Remove from the middle or end
            prev.next=prev.next.next;
        }
    }
    // 10. Copying a linked list
    SinglyLL newList;
    public SinglyLL copy(){
        newList=new SinglyLL();
        if(head==null) return newList;
        newList.head=new Node(head.elem);
        Node temp=head.next;
        Node newTemp=newList.head;
        while(temp!=null){
            newTemp.next=new Node(temp.elem);
            temp=temp.next;
            newTemp=newTemp.next;
        }
        System.out.println("Successfully copied.");
        return newList;
    }
    // 11. Out-of-place reverse of a linked list
    SinglyLL reversedList;
    public SinglyLL reverseOutOfPlace(){
        reversedList=new SinglyLL();
        if(head==null) return reversedList;
        Node temp=head;
        while(temp!=null){
            Node newNode=new Node(temp.elem);
            newNode.next=reversedList.head;
            reversedList.head=newNode;
            temp=temp.next;
        }
        return reversedList;
    }
    // 12. In-place reverse of a linked list
    public void reverseInPlace(){
        Node temp=head,prev=null,next;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
    // 13. Rotating the list right
    public void rotateRight(int k){
        int size=count();
        k%=size;
        if(head==null||head.next==null||k<=0) return;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        Node newTail=head;
        for (int i=1;i<size-k;i++){
            newTail=newTail.next;
        }
        Node newHead=newTail.next;
        newTail.next=null;
        head=newHead;
    }
    // 14. Rotating the list left
    public void rotateLeft(int k){
        int size=count();
        k%=size;
        if(head==null||head.next==null||k<=0) return;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        Node newTail=head;
        for(int i=1;i<size-k-1;i++){
            newTail=newTail.next;
        }
        Node newHead=newTail.next;
        newTail.next=null;
        head=newHead;
    }
}