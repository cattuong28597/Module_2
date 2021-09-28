package com.codegym.week3.day5.BST;

public interface Tree<E> {

    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
