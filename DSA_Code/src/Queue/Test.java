package Queue;

public class Test {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.queue(1);
        array.queue(2);
        array.queue(3);
        array.queue(4);
        array.dequeue();
        array.dequeue();
        array.dequeue();
        array.dequeue();
        array.dequeue();

        array.printArray();
    }
}
