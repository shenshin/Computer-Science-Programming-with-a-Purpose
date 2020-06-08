// /* *****************************************************************************
//  *  Name:              Alekandr Shenshin
//  *  Coursera User ID:  ******
//  *  Last modified:     4/6/2020
//  **************************************************************************** */

public class TrinomialDP {
    // Returns the trinomial coefficient T(n, k).
    // Используется метод динамического программирования вместо рекурсии
    // для чего, в качестве хранилища промежуточных значений используется
    // массив long[][] s
    public static long trinomial(int n, int k) {
        if (n < Math.abs(k)) return 0L;
        else if (n == k) return 1L;
        else {
            long[][] s = new long[n + 1][n + 2];
            s[0][0] = 1L;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    s[i][j] = s[i - 1][Math.abs(j - 1)] + s[i - 1][j] + s[i - 1][j + 1];
                }
            }
            return s[n][Math.abs(k)];
        }
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
}
