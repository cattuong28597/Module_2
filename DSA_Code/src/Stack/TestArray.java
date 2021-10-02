package Stack;

public class TestArray {
    public static void main(String[] args) {
//        Array array = new Array(5);
//        array.push(1);
//        array.push(2);
//        array.push(3);
//        array.push(4);
//        array.push(5);
//        array.push(6);
//        array.printArray();

////
//        LinkedListStack linkedListStack = new LinkedListStack();
//        linkedListStack.push(5);
//        linkedListStack.push(4);
//        linkedListStack.push(3);
//        linkedListStack.push(2);
//        linkedListStack.push(1);
//
//        System.out.println(linkedListStack.pop());
//        System.out.println(linkedListStack.pop());
//        System.out.println(linkedListStack.pop());
////
        MyLinkedListStack myLinkedListStack = new MyLinkedListStack();
        myLinkedListStack.push(5);
        myLinkedListStack.push(4);
        myLinkedListStack.push(3);
        myLinkedListStack.push(2);
        myLinkedListStack.push(1);
        myLinkedListStack.pop();
        myLinkedListStack.print();

    }
}
