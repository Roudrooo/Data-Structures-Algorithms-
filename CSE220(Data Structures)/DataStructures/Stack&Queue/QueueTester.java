public class QueueTester {
    public static void main(String[] args) {
        LinkedListQueue queue=new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Original Queue:");
        queue.displayQueue();
        // Reverse Queue
        queue = QueueOperation.reverseQueue(queue);
        System.out.println("Reversed Queue:");
        queue.displayQueue();

        // Generate Binary Numbers
        
        System.out.println("Binary Numbers up to 5:");
        QueueOperation.generateBinaryNumbers(5);

        // Check Palindrome Queue
        LinkedListQueue palindromeQueue = new LinkedListQueue();
        palindromeQueue.enqueue(1);
        palindromeQueue.enqueue(2);
        palindromeQueue.enqueue(3);
        palindromeQueue.enqueue(2);
        palindromeQueue.enqueue(1);

        System.out.println("Is the queue a palindrome? " + QueueOperation.isQueuePalindrome(palindromeQueue));
    }
}
