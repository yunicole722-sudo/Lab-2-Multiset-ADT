/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(int item);

    /**
     * Remove one occurrence of the given item from this multiset.
     *
     * @param item the item to remove
     */
    abstract void remove(int item);

    /**
     * Return the number of times the given item appears in this multiset.
     *
     * @param item the item to count
     * @return the count of item
     */
    abstract int count(int item);

    /**
     * Return whether the given item is in this multiset.
     *
     * @param item the item to check
     * @return whether item is in this multiset
     */
    abstract boolean contains(int item);
}
