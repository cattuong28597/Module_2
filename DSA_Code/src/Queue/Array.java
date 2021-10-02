package Queue;

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

    public void queue(E element) {
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

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Array is null");
        }
        else{
            int i = 0;
            while(i!=index-1){
                arr[i] = arr[i+1];
                i++;
            }
            index--;
        }
    }

    public void printArray(){
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }

}
