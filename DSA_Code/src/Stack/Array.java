package Stack;

public class Array<E> {
    private Object arr[];
    private int size;
    private int index = 0;

    public Array(int size) {
        this.size = size;
        arr = new Object[size];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }

    public void push(E element) {
        if (isFull()) {
            index++;
            Object newArray[] = new Object[index];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            newArray[index-1] = element;
            arr = newArray;
        }
        else{
            arr[index] = element;
            index++;
        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Array is null");
        } else {
            index--;
        }

    }

    public void printArray(){
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}
