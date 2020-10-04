package collections;

import java.util.Arrays;
import java.util.List;

class Test {
    public static void main(String[] args) {
        SDAArraylist<Integer> arraylist = new SDAArraylist<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        arraylist.add(8);
        arraylist.display();

        arraylist.remove(0);
        System.out.println(arraylist.get(0));
        arraylist.display();
    }
}

public class SDAArraylist<T> {


    private static final int INITIAL_CAPACITY = 5;
    private Object[] elementArray;
    private int size = 0;

    public SDAArraylist() {
        elementArray = new Object[INITIAL_CAPACITY];
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
        }
        return (T) elementArray[index];
    }

    public void add(T t) {
        if (size == elementArray.length) {
            increaseArraySize();
        }
        elementArray[size++] = t;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
        }
        Object removedElement = elementArray[index];
        for (int i = index; i < size - 1; i++) {
            elementArray[i] = elementArray[i+1];
        }
        size--;
        decreaseArraySize();
        return (T) removedElement;
    }

    public void display() {
        for (Object element : elementArray) {
            System.out.println(element);
        }
    }
    private void decreaseArraySize() {
        elementArray = Arrays.copyOf(elementArray, elementArray.length - 1);
    }

    private void increaseArraySize() {
        int newIncreasedCapacity = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray, newIncreasedCapacity);
    }
}
