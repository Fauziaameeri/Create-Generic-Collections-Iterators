
import java.util.*;

/**
 * This class will manage an array list of objects
 * @param <E> object type that the array list manages
 */
public class MyArrayList<E> {
    private E[] data; // native array of any object types
    private int size;   // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 5;

    /**
     * Construct an array list with size of 0 with default capacity
     */
    public MyArrayList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    /**
     *
     * @param value add value to end of array list
     */
    public void add(E value) {
        // check that value can be added to native array
        checkCapacity(size + 1);

        // add value to end of array list
        data[size] = value;

        // increase the size of the array list
        size++;
    }

    /**
     *
     * @return the number of elements in the array list
     */
    public int size() {
        return size;
    }


    /**
     * @param index 0 <= index < size()
     * @return the integer at the given index in the list
     */
    public E get(int index) {
        // checkIndex may throw an IndexOutOfBoundsException
        checkIndex(index);

        return (E) data[index];
    }


    /**
     * @param value the value to search for
     * @return returns the position of the first occurrence of the given
     * value (-1 if not found)
     */
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Removes the value at given index from array list
     *
     * @param index 0 <= index < size() (checkIndex will throw exception if not)
     */
    public void remove(int index) {
        // check if index in correct range
        checkIndex(index);

        // overwrites the value to be removed by shifting existing values left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        // decrement the size of the arraylist (this is NOT the length of the native array)
        size--;
    }

    // throws an IndexOutOfBoundsException if the given index is
    // not a legal index
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    // checks that the underlying array has the given capacity,
    //       expanding the size if it does not
    private void checkCapacity(int capacity) {
        if (capacity > data.length) {
            expandSize();
        }
    }

    // doubles the size of the array
    private void expandSize() {

        int increasedSize = data.length * 2;

        data = Arrays.copyOf(data, increasedSize);
    }

    @Override
    public String toString() {

        if (size == 0)
            return "[]";


        String result = "[" + data[0];

        for (int i = 1; i < size; i++) {
            result += ", " + data[i];
        }

        return result += "]";

    }
}
