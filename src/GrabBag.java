import java.util.*;

/**
 * This class manages a grab bag where you can add characters and randomly
 * select characters from the grab bag
 */
public class GrabBag<E> implements Iterable<E> {

    private ArrayList<E> bag;

    /**
     * constructs an arraylist and adds all characters from list to the grab bag
     */
    public GrabBag(ArrayList<E> list) {
        bag = new ArrayList<>();
        bag.addAll(list);
    }

    /**
     *
     * @param data character to add to end of grab bag
     */
    public void add(E data) {
        bag.add(data);
    }

    /**
     * randomly select a character from the grab bag
     *
     * @return the character
     */
    public E grab() {
        Random r = new Random();
        return bag.remove(r.nextInt(bag.size()));
    }

    /**
     *
     * @return true if grab bag is empty, false otherwise
     */
    public boolean isEmpty() {
        return bag.size() == 0;
    }

    @Override
    public String toString() {
        return bag.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new GrabBagIterator(bag);
    }

}

class GrabBagIterator<E> implements Iterator<E> {

    int indexPosition = 0;

    ArrayList<E> internalList;

    public GrabBagIterator(ArrayList<E> internalList) {
        this.internalList = internalList;
    }

    @Override
    public boolean hasNext() {
        if (internalList.size() >= indexPosition + 1) {
            return true;
        }
        return false;
    }

    @Override
    public E next() {
        E val = internalList.get(indexPosition);
        indexPosition += 1;
        return val;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Do not remove using the Iterator.");
    }

}