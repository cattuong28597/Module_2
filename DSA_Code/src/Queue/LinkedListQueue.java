package Queue;

import MyLinkedList.Method.Method;

public class LinkedListQueue<E> {
    Method<E> myLinkedListQueue = new Method<>();
    private int count = 0;

    public void queue(E element) {
        if (count == 0) {
            myLinkedListQueue.addFirst(element);
            count++;
        } else {
            myLinkedListQueue.addLast(element);
            count++;
        }
    }

    public void dequeue() {
        if (count == 0) {
            System.out.println("The linked List is null");
        } else {
            myLinkedListQueue.removeFirst();
            count--;
        }
    }

    public void print() {
        myLinkedListQueue.printList();
    }
}
