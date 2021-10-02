package Stack;

import java.util.LinkedList;

public class LinkedListStack<E> {

    private LinkedList<E> myLinkedList;

    public LinkedListStack() {
        myLinkedList = new LinkedList<E>();
    }

    public void push(E element) {
        myLinkedList.addLast(element);

    }

    public E pop() {
        if (myLinkedList.isEmpty()){
            System.out.println("This Linked List is null");
        }
        return myLinkedList.removeLast();
    }


}
