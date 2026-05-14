public class TreeMultiSet extends MultiSet {
    private Tree tree;
    // TODO add a Tree object as a private instance variable for this class.
    /**
     * Constructor for TreeMultiSet.
     */
    public TreeMultiSet() {
        this.tree = new Tree(null);
    }

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        // TODO complete this method
        this.tree.insert(item);
    }


    // TODO write the rest of the implementation for this class so that it uses its private Tree
    //      object to provide the MultiSet functionality.
    /**
     * Remove one occurrence of the given item.
     *
     * @param item the item to remove
     */
    @Override
    void remove(Integer item) {
        this.tree.deleteItem(item);
    }

    /**
     * Return whether this multiset contains the item.
     *
     * @param item the item to search for
     * @return true if found, false otherwise
     */
    @Override
    boolean contains(Integer item) {
        return this.tree.contains(item);
    }

    /**
     * Return whether this multiset is empty.
     *
     * @return true if empty
     */
    @Override
    boolean isEmpty() {
        return this.tree.isEmpty();
    }

    /**
     * Return the number of occurrences of the item.
     *
     * @param item the item to count
     * @return number of occurrences
     */
    @Override
    int count(Integer item) {
        return this.tree.count(item);
    }

    /**
     * Return the size of this multiset.
     *
     * @return size of multiset
     */
    @Override
    int size() {
        return this.tree.size();
    }



}
