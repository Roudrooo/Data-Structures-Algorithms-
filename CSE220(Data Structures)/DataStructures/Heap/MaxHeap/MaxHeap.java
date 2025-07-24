public class MaxHeap{
    private int heap[];
    private int size;
    private int capacity;
    private MaxHeap(int capacity){
        this.capacity=capacity;
        heap=new int[capacity];
        size=1;
    }

    public void insert(int value){
        if(size==capacity) System.out.println("Heap is full.");
        else{
            heap[size]=value;
            heap_increase_key__SWIM(size);
            size++;
        }
    }

    public void heap_increase_key__SWIM(int index){
        if(index>1&&heap[index]>heap[parent(index)]){
            swap(index,parent(index));
            heap_increase_key__SWIM(parent(index));
        }
    }

    public int parent(int index){
        return index/2;
    }

    public void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }

    public void max_heapify__SINK(int index){
        int largest=index;
        int left=2*index;
        int right=2*index+1;
        if(left<size&&heap[left]>heap[largest]) largest=left;
        if(right<size&&heap[right]>heap[largest]) largest=right;
        if(largest!=index){
            swap(index,largest);
            max_heapify__SINK(largest);
        }
    }

    public int heap_extract_max__DELETEMAX(){
        if(size==0) throw new IllegalStateException("Heap is empty");
        int maxValue=heap[1];
        swap(1,size-1);
        size--;
        max_heapify__SINK(1);
        return maxValue;
    }

    public int get_max(){
        if(size==0) throw new IllegalStateException("Heap is empty");
        return heap[1];
    }

    public void heapSort(){
        int originalSize=size;
        for(int i=size-1;i>1;i--){
            swap(1,i);
            size--;
            max_heapify__SINK(1);
        }
        size=originalSize;
    }

    public void printHeap(){
        for(int i=1;i<size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public void printSorted(){
        heapSort();
        printHeap();
    }

    public static void main(String[] args){
        MaxHeap maxHeap=new MaxHeap(15);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(7);
        maxHeap.insert(30);
        maxHeap.insert(15);
        maxHeap.insert(98);
        maxHeap.insert(17);
        maxHeap.insert(1);
        maxHeap.insert(543);


        System.out.println("Heap:");
        maxHeap.printHeap();

        System.out.println("Max: "+maxHeap.get_max());

        System.out.println("Delete max: "+maxHeap.heap_extract_max__DELETEMAX());

        System.out.println("Heap after deletion:");
        maxHeap.printHeap();

        System.out.println("Heap Sort:");
        maxHeap.printSorted();

    }
}