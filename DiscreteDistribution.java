/* *****************************************************************************
 *  Name:              Alex Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     13/5/2020
 ****************************************************************************
 *
 *             Discrete distribution.
 *
 *  Write a program DiscreteDistribution.java that takes an integer command-line
 *  argument m, followed by a sequence of positive integer command-line arguments
 *  a1,a2,…,an and prints m random indices (separated by whitespace), choosing
 *  each index i with probability proportional to ai
 *  */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        int[] cumSums = new int[n + 1];
        // To generate a random index i with probability proportional to ai
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);

            // Define the cumulative sums Si=a1+a2+…+ai and S0=0
            cumSums[i + 1] = cumSums[i] + a[i];
        }
        // последний элемент массива кумулитивных сумм
        int sMax = cumSums[cumSums.length - 1];

        for (int i = 0; i < m; i++) {

            // Pick a random integer r uniformly between 0 and Sn−1
            int r = (int) (Math.random() * sMax);

            // Find the unique index i between 1 and n such that Si−1≤r<Si
            for (int j = 1; j <= cumSums.length; j++) {
                if (r >= cumSums[j - 1] && r < cumSums[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }
        // System.out.println();
    }
}
