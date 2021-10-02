package Queue;

import Stack.MyLinkedListStack;

public class Test {
    public static void main(String[] args) {
//        Array array = new Array(3);
//        array.queue(1);
//        array.queue(2);
//        array.queue(3);
//        array.queue(4);
//        array.dequeue();
//        array.dequeue();
//        array.dequeue();
//
//        array.printArray();

        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.queue(5);
        linkedListQueue.queue(4);
        linkedListQueue.queue(3);
        linkedListQueue.queue(2);
        linkedListQueue.queue(1);
        linkedListQueue.print();
        System.out.println("===========================");
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();
        linkedListQueue.print();
    }
}
