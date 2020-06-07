/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     1/6/2020
 **************************************************************************** */

public class TrinomialBrute {
    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0)
            return 1L;
        else if (k < -n || k > n)
            return 0L;
        else
            return trinomial(n - 1, k - 1) + trinomial(n - 1, k) + trinomial(n - 1, k + 1);
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
}

