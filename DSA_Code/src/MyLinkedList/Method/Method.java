package MyLinkedList.Method;

public class Method<E> {
    Node<E> head = null;
    Node<E> tail = null;
    public int count = 0;

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        Node<E> temp = head;
        head = newNode;
        head.next = temp;
        if(tail == null){
            tail = head;
        }
        count++;
    }
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        tail.next = newNode;
        tail = tail.next;
        if(tail == null){
            tail = head;
        }
        count++;
    }
    public void addIndex(E e,int index){
        if(index == 0){
            addFirst(e);
        }
        else if(index == count){
            addLast(e);
        }
        else if(index > 0 && index < count){
            Node<E> newNode = new Node<>(e);
            Node tempFront = head;
            int i=0;
            while(i!=index-1){
                tempFront = tempFront.next;
                i++;
            }
            Node tempBack = tempFront.next;
            tempFront.next = newNode;
            newNode.next = tempBack;
        }
        count++;
    }

    public void removeFirst(){
        if(head != null){
            head = head.next;
            count--;
        }
    }

    public void removeLast(){
        if(tail != null){
            Node temp = head;
            int index = 0;
            while(index != count-2){
                index++;
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            count--;
        }
    }

    public void removeIndex(int index){
        if(index < count){
            Node tempFront = head;
            int i=0;
            while(i!=index-1){
                tempFront = tempFront.next;
                i++;
            }
            Node tempBack = tempFront.next.next;
            tempFront.next = tempBack;
            count--;
        }
    }

    public void getFirst() {
        if (head != null) {
            System.out.println(head.element);
        }
    }

    public void getLast() {
        if (head != null) {
            System.out.println(tail.element);
        }
    }

    public void getIndex(int index) {
        if (count != 0) {
            Node temp = head;
            int i = 0;
            while (i != index) {
                temp = temp.next;
                i++;
            }
            System.out.println(temp.element);
        }
    }

    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

}
