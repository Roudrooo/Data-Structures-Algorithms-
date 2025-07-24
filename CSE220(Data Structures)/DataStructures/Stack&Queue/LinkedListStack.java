public class LinkedListStack {
    private Node top;
    public LinkedListStack(){
        this.top=null;
    }
    public void push(int val){
        Node newNode=new Node(val);
        newNode.next=top;
        top=newNode;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty! Cannot pop from a empty stack.");
            return 9999999;
        }
        int poppedValue=top.elem;
        top=top.next;
        return poppedValue;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty! Cannot peek from a empty stack.");
            return 9999999;
        }
        return top.elem;
    }
    public void displayStack(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        Node current=top;
        System.out.println("Stack top to bottom:");
        while(current!=null){
            System.out.print(current.elem+"-->");
            current=current.next;
        }
        System.out.println("Null");
    }
}
