package s06_collection.exercise.myarraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elements;
    private final Class<E> type;

    public MyArrayList(Class<E> type) {
        this.type = type;
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(Class<E> type, int capacity) {
        this.type = type;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E o) {
        for (int index = 0; index < this.size; index++) {
            if (elements[index].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int index = 0; index < this.size; index++) {
            if (elements[index].equals(o)) {
                return index;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            try {
                ensureCapacity(this.size + DEFAULT_CAPACITY);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        }
        elements[size] = e;
        size++;
        return true;
    }

    public Object get(int index) {
        return elements[index];
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            try {
                ensureCapacity(this.size + DEFAULT_CAPACITY);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] remain = Arrays.copyOfRange(elements, index, size);
            elements[index] = e;
            for (int i = 0; i < remain.length; i++) {
                elements[i + index + 1] = remain[i];
            }
            size++;
        }
    }

    public void ensureCapacity(int minCapacity) throws Exception {
        if (minCapacity < this.size) {
            throw new Exception("Small capacity");
        } else {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    public void clear() {
        for (int index = 0; index < this.size; index++) {
            elements[index] = null;
        }
        size = 0;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            Object deletedElement = elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size] = null;
            size--;
            return (E) deletedElement;
        }
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> clone = new MyArrayList<>(type);
        for (int i = 0; i < size; i++) {
            try {
                E e = type.cast(elements[i]);
                clone.add(e);
            } catch (ClassCastException e) {
                return null;
            }
        }
        return clone;
    }
}
