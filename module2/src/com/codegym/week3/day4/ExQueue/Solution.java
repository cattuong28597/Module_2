package com.codegym.week3.day4.ExQueue;

public class Solution {
    public static void enQueue(Queue p, int value) {
        Node temp = new Node();
        temp.data = value;
        if (p.front == null) {
            p.front = temp;
        } else {
            p.rear.link = temp;
        }

        p.rear = temp;
        p.rear.link = p.front;

        System.out.print(temp.data + " ");
    }

    public static void deQueue(Queue p) {
        if (p.front == null) {
            System.out.println("Queue is empty");
        } else{
            int value;
            if (p.front == p.rear) {
                value = p.front.data;
                p.front = p.rear = null;
            } else {
                Node temp = p.front;
                value = temp.data;
                p.front = p.front.link;
                p.rear.link = p.front;
            }
            System.out.println("\nElement is deleted: " + value);
        }
    }

//    public static void displayQueue(Queue key) {
//        if (key.front == null) {
//            System.out.println("Queue is empty");
//        } else {
//            Node temp = key.front;
//            System.out.print("Elements in Queue are: ");
//            while (temp.link != key.front) {
//                System.out.print(temp.data);
//                temp = temp.link;
//            }
//            System.out.print(temp.data);
//        }
//    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        enQueue(queue, 5);
        enQueue(queue, 4);
        enQueue(queue, 3);

        deQueue(queue);

        enQueue(queue, 2);
        enQueue(queue, 1);

        deQueue(queue);
    }
}
