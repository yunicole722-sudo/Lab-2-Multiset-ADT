import java.util.ArrayList;
import java.util.Random;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py
    // Private instance variables
    private Integer root;
    private ArrayList<Tree> subtrees;

    /**
     * Create a new Tree with the given root.
     *
     * @param root the root value
     */
    public Tree(Integer root) {
        this.root = root;
        this.subtrees = new ArrayList<>();
    }

    /**
     * Return whether this tree is empty.
     *
     * @return true if empty
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Return the size of this tree.
     *
     * @return number of items in the tree
     */
    public int size() {
        if (this.isEmpty()) {
            return 0;
        }

        int size = 1;

        for (Tree subtree : this.subtrees) {
            size += subtree.size();
        }

        return size;
    }

    /**
     * Return number of occurrences of item.
     *
     * @param item the item to count
     * @return number of occurrences
     */
    public int count(int item) {
        if (this.isEmpty()) {
            return 0;
        }

        int num = 0;

        if (this.root == item) {
            num++;
        }

        for (Tree subtree : this.subtrees) {
            num += subtree.count(item);
        }

        return num;
    }

    /**
     * Return whether item exists in tree.
     *
     * @param item the item to search for
     * @return true if found
     */
    public boolean contains(int item) {
        if (this.isEmpty()) {
            return false;
        }

        if (this.root == item) {
            return true;
        }

        for (Tree subtree : this.subtrees) {
            if (subtree.contains(item)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Insert an item into the tree.
     *
     * @param item item to insert
     */
    public void insert(int item) {

        if (this.isEmpty()) {
            this.root = item;

        } else if (this.subtrees.isEmpty()) {
            this.subtrees.add(new Tree(item));

        } else {
            Random random = new Random();

            if (random.nextInt(3) + 1 == 3) {
                this.subtrees.add(new Tree(item));

            } else {
                int index = random.nextInt(this.subtrees.size());
                this.subtrees.get(index).insert(item);
            }
        }
    }

    /**
     * Delete one occurrence of item from tree.
     *
     * @param item item to delete
     * @return true if deleted
     */
    public boolean deleteItem(int item) {

        if (this.isEmpty()) {
            return false;

        } else if (this.root == item) {
            this.deleteRoot();
            return true;

        } else {

            for (int i = 0; i < this.subtrees.size(); i++) {

                Tree subtree = this.subtrees.get(i);

                boolean deleted = subtree.deleteItem(item);

                if (deleted && subtree.isEmpty()) {
                    this.subtrees.remove(i);
                    return true;

                } else if (deleted) {
                    return true;
                }
            }

            return false;
        }
    }

    /**
     * Delete the root of this tree.
     */
    private void deleteRoot() {

        if (this.subtrees.isEmpty()) {
            this.root = null;

        } else {

            Tree chosenSubtree =
                    this.subtrees.remove(this.subtrees.size() - 1);

            this.root = chosenSubtree.root;

            this.subtrees.addAll(chosenSubtree.subtrees);
        } }

}
