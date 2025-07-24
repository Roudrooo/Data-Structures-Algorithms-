public class LinkedListQueue {
    private Node front,rear;
    public LinkedListQueue(){
        this.front=this.rear=null;
    }
    public void enqueue(int elem){
        Node newNode=new Node(elem);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return 999999;
        }
        int removedElem=front.elem;
        front=front.next;
        if(front==null){
            rear=null;
        }
        return removedElem;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return 999999;
        }
        return front.elem;
    }
    public void displayQueue() {
        Node current = front;
        System.out.print("Queue (front to rear): ");
        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
