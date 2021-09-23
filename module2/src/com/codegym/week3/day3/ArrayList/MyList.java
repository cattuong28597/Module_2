package com.codegym.week3.day3.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index+ " out of bounds");
        }
    }

    public void add(E e) {
        ensureCapacity();
        elements[size] = e;
        size++;
    }

     public void add(int index, E element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
     }

     public E remove(int index) {
        checkIndex(index);

        E e = (E) elements[index];
        for (int j = index; j < size - 1; j++) {
            elements[j] = elements[j + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
     }

     public int size() {
        return this.size;
     }
    @Override
     public MyList clone() {
        MyList<E> clone = new MyList<E>(elements.length);
        for (E e : (E[]) elements) {
           clone.add(e);
        }
        return clone;
     }

     public boolean contains(E e) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                check = true;
                break;
            }
        }
        return check;
     }

     public E get(int i) {
        checkIndex(i);
        return (E) elements[i];
     }

     public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
     }

     public void print() {
        int i = 0;
        for (E e: (E[]) elements) {
            System.out.println("Element " + i+ ": "+e);
            i++;
        }
     }
}
