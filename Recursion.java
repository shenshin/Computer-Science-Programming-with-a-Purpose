/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Recursion {
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        // StdOut.printf("%S%n", hanoi(n, false));

        //StdOut.println(longestCommonSubsequence("ggcaccacg", "acggcggatacg"));

        // double hust = Double.parseDouble(args[0]);
        // double s = Math.pow(2, 2 * hust);
        // curve(0, 0.5, 1.0, 0.5, 0.01, s);

        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(0.0015);
        draw(n, 0.5, 0.5, 0.5);
        StdDraw.show();
    }

    public static String hanoi(int n, boolean left) {
        if (n == 0) return "  ";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return hanoi(n - 1, !left) + move + hanoi(n - 1, !left);
    }

    public static int longestCommonSubsequence(String s, String t) {
        int M = s.length();
        int N = t.length();

        int[][] opt = new int[M + 1][N + 1];

        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                if (i == 0 || j == 0) {
                    opt[i][j] = 0;
                }
                else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    opt[i][j] = opt[i - 1][j - 1] + 1;
                }
                else {
                    opt[i][j] = Math.max(opt[i][j - 1], opt[i - 1][j]);
                }
            }
        }
        // for (int i = M - 1; i >= 0; i--) {
        //     for (int j = N - 1; j >= 0; j--) {
        //         if (s.charAt(i) == t.charAt(j)) {
        //             opt[i][j] = opt[i + 1][j + 1] + 1;
        //         }
        //         else {
        //             opt[i][j] = Math.max(opt[i][j + 1], opt[i + 1][j]);
        //         }
        //     }
        // }
        // for (int i = 0; i <= M; i++) {
        //     for (int j = 0; j <= N; j++) {
        //         StdOut.print(opt[i][j] + "  ");
        //     }
        //     StdOut.println();
        // }
        // return opt[0][0];
        return opt[M][N];
    }

    public static long fibonacci(int n) {
        long[] F = new long[n + 1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 2] + F[i - 1];
        }
        return n <= 92 ? F[n] : Long.MAX_VALUE;
    }

    public static int Q5(int n) {
        int[] b = new int[n + 1];
        b[0] = 1;
        for (int i = 2; i <= n; i++) {
            b[i] = 0;
            for (int j = 0; j < i; j++)
                b[i] += b[j];
        }
        return b[n];
    }

    public static void Q4(int n) {
        if (n <= 0) return;
        StdOut.println(n);
        Q4(n - 2);
        Q4(n - 3);
        StdOut.println(n);
    }

    public static void Q3(int n) {
        if (n <= 0) return;
        StdOut.println(n);
        Q3(n - 2);
        Q3(n - 3);
        StdOut.println(n);
    }

    public static int Q2(int n) {
        if (n <= 0) return 1;
        return 1 + Q2(n - 2) + Q2(n - 3);
    }

    public static void curve(double x0, double y0, double x1, double y1, double var, double s) {
        if (x1 - x0 < 0.01)
            StdDraw.line(x0, y0, x1, y1);
        else {
            double xm = (x0 + x1) / 2;
            double ym = (y0 + y1) / 2;
            double stddev = Math.sqrt(var);
            double delta = StdRandom.gaussian(0, stddev);
            curve(x0, y0, xm, ym + delta, var / s, s);
            curve(xm, ym + delta, x1, y1, var / s, s);
        }
    }

    public static void draw(int n, double sz, double x, double y) {
        if (n == 0) return;
        double x0 = x - sz / 2;
        double x1 = x + sz / 2;
        double y0 = y - sz / 2;
        double y1 = y + sz / 2;
        StdDraw.line(x0, y, x1, y);
        StdDraw.line(x0, y0, x0, y1);
        StdDraw.line(x1, y0, x1, y1);
        draw(n - 1, sz / 2, x0, y0);
        draw(n - 1, sz / 2, x0, y1);
        draw(n - 1, sz / 2, x1, y0);
        draw(n - 1, sz / 2, x1, y1);
    }

    public static void collatz(int N) {
        StdOut.print(N + " ");
        if (N == 1) //noinspection UnnecessaryReturnStatement
            return;
        else if (N % 2 == 0) collatz(N / 2);
        else collatz(3 * N + 1);
    }

    public static String binaryConvert(int decimal) {
        if (decimal == 1) return "1";
        return binaryConvert(decimal / 2) + (decimal % 2);
    }
}


