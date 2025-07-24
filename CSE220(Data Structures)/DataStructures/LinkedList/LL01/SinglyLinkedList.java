public class SinglyLinkedList{

    // Node Class
    private static class Node{
        int elem;
        Node next;
    private Node(int elem){    //   private Node(int elem, Node next){
        this.elem=elem;        //       this.elem=elem;
        this.next=null;         //       this.next=next;
    }                          //   }
    }

    private Node head;

    // 1. Creating a LinkedList from an Array
    public void CreateLinkedListFromArray(int[] arr){
        if(arr==null||arr.length==0) return;
        head=new Node(arr[0]); // head=new Node(arr[0],null);
        Node tail=head;
        for(int i=1;i<arr.length;i++){
            Node n=new Node(arr[i]);   // Node n=new Node(arr[i],null);
            tail.next=n;
            tail=tail.next;
        }
    }

    // 2. Iterate
    public void Iterate(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.elem + " -> ");
            temp=temp.next;
        }
    }

    // 3. Count
    public int count(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    // 4. nodeAt
    public int nodeAt(int idx){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(count==idx){
                return temp.elem;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }

    // 5. Insertion
    public void
}
