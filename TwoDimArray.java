/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        double[][] mA = {
                { 0.7, 0.2, 0.1 },
                { 0.3, 0.6, 0.1 },
                { 0.5, 0.1, 0.4 }
        };
        double[][] mB = {
                { 0.8, 0.3, 0.5 },
                { 0.1, 0.4, 0.1 },
                { 0.1, 0.3, 0.4 }
        };
        int n = mA.length;
        double[][] mC = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    mC[i][j] += mA[i][k] * mB[k][j];
        System.out.println(Arrays.deepToString(mC));
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };
        a = b;

        System.out.println(Arrays.toString(a));
    }

    static double vectorDotProduct(double[] vectorA, double[] vectorB) {
        assert vectorA.length == vectorB.length : "arrays should be the same length";
        double sum = 0.0;
        for (int i = 0; i < vectorA.length; i++) {
            sum += vectorA[i] * vectorB[i];
        }
        return sum;
    }
}
