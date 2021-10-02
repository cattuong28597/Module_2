package Stack;

import MyLinkedList.Method.Method;


public class MyLinkedListStack<E> {
    Method<E> myLinkedList;
    private int count = 0;

    public MyLinkedListStack () {
        myLinkedList = new Method<E>();
    }

    public void push(E element) {
        if (count == 0) {
            myLinkedList.addFirst(element);
            count++;
        } else {
            myLinkedList.addLast(element); count++;
        }

    }

    public void pop() {
        myLinkedList.removeLast();
    }
    public void print() {
        myLinkedList.printList();
    }


}
