public class GfG {

    public static long TrinomialValue(long dp[][], int n, int k) {
        // Using property of trinomial triangle.
        if (k < 0)
            k = -k;

        // If value already calculated, return that.
        if (dp[n][k] != 0)
            return dp[n][k];

        // base case
        if (n == 0 && k == 0)
            return 1;

        // base case
        if (k < -n || k > n)
            return 0;

        // recursive step and storing the value.
        return (dp[n][k] = TrinomialValue(dp, n - 1, k - 1)
                + TrinomialValue(dp, n - 1, k)
                + TrinomialValue(dp, n - 1, k + 1));
    }

    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        long[][] dp = new long[n + 2][k + 2];
        System.out.println(TrinomialValue(dp, n, k));
    }

}


// public class GfG {
//
//     private static final int MAX = 41;
//
//     // Function to find the trinomial triangle value.
//     public static long TrinomialValue(long dp[][], int n, int k) {
//         // Using property of trinomial triangle.
//         if (k < 0)
//             k = -k;
//
//         // If value already calculated, return that.
//         if (dp[n][k] != 0)
//             return dp[n][k];
//
//         // base case
//         if (n == 0 && k == 0)
//             return 1;
//
//         // base case
//         if (k < -n || k > n)
//             return 0;
//
//         // recursive step and storing the value.
//         return (dp[n][k] = TrinomialValue(dp, n - 1, k - 1)
//                 + TrinomialValue(dp, n - 1, k)
//                 + TrinomialValue(dp, n - 1, k + 1));
//     }
//
//     // Function to print Trinomial Triangle of height n.
//     public static void printTrinomial(int n) {
//         long[][] dp = new long[MAX][MAX];
//
//         // printing n rows.
//         for (int i = 0; i < n; i++) {
//             // printing first half of triangle
//             for (int j = -i; j <= 0; j++)
//                 System.out.print(TrinomialValue(dp, i, j) + " ");
//
//             // printing second half of triangle.
//             for (int j = 1; j <= i; j++)
//                 System.out.print(TrinomialValue(dp, i, j) + " ");
//
//             System.out.println();
//         }
//     }
//
//     // driver function
//     public static void main(String argc[]) {
//         int n = 40;
//         printTrinomial(n);
//     }
//
// }
