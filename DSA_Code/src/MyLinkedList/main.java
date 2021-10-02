package MyLinkedList;

import MyLinkedList.Method.Method;


public class main {
    public static void main(String[] args) {

        Method list = new Method();
        list.addFirst("Hue");
        list.addFirst("Sai Gon");
        list.addFirst("Da Nang");
        list.addFirst("DakLak");
        list.addFirst("Ha Noi");
        list.addLast("Quang Nam");

        list.printList();
//        System.out.println("===============");
//        list.getFirst();
//        list.getLast();
//        list.getIndex(3);
//        list.printList();
    }
}
