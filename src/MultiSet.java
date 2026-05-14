/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);

    // TODO finish adding abstract methods to fully describe what it means to be a MultiSet.
    /**
     * Remove one occurrence of the given item.
     *
     * @param item the item to remove
     */
    abstract void remove(Integer item);

    /**
     * Return whether this multiset contains the given item.
     *
     * @param item the item to search for
     * @return true if the item exists
     */
    abstract boolean contains(Integer item);

    /**
     * Return whether this multiset is empty.
     *
     * @return true if empty
     */
    abstract boolean isEmpty();

    /**
     * Return the number of occurrences of the given item.
     *
     * @param item the item to count
     * @return number of occurrences
     */
    abstract int count(Integer item);

    /**
     * Return the size of this multiset.
     *
     * @return size of multiset
     */
    abstract int size();

}
