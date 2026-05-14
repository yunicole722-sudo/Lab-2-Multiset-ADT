import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // TODO complete this psvm main method to replicate the timing experiment from adts.py.
        //      Note: this will be client code of the various other classes needing to be written.
        MultiSet[] multisets = {
                new TreeMultiSet()
        };

        int[] problemSizes = {500, 1000, 2000, 4000};

        for (MultiSet multiset : multisets) {
            for (int n : problemSizes) {
                profileMultiSet(multiset, n);
            } }
    }

    public static void profileMultiSet(MultiSet myInput, int n) {
        ArrayList<Integer> itemsAdded = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int x = random.nextInt(101);
            myInput.add(x);
            itemsAdded.add(x);
        }

        long start = System.nanoTime();

        for (Integer x : itemsAdded) {
            myInput.remove(x);
        }

        long end = System.nanoTime();

        double elapsedSeconds = (end - start) / 1_000_000_000.0;

        System.out.printf("%5d %25s %10.6f%n",
                n,
                myInput.getClass().getSimpleName(),
                elapsedSeconds);
    }

}
