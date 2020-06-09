public class ThreeSum {
    public static void main(String[] args) {
        int[] arrayOfInts = StdIn.readAllInts();
        double start = System.currentTimeMillis() / 1000.0;
        int cnt = count(arrayOfInts);
        double end = System.currentTimeMillis() / 1000.0;
        StdOut.printf("Found %d numbers (%.2f seconds)%n", cnt, end - start);
    }

    public static int count(int[] arrayOfInts) {
        int length = arrayOfInts.length;
        int counter = 0;
        for (int i = 0; i < length; i++)
            for (int j = i + 1; j < length; j++)
                for (int k = j + 1; k < length; k++)
                    if (arrayOfInts[i] + arrayOfInts[j] + arrayOfInts[k] == 0)
                        counter++;
        return counter;
    }
}
