/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     19/5/2020
 **************************************************************************** */
// программа прошла 12 из 12 тестов
public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Math.abs(Integer.parseInt(args[0]));
        int[] elements = new int[m];
        int[] sequence = StdIn.readAllInts();

        for (int i = 0; i < sequence.length; i++)
            elements[sequence[i] - 1]++;

        double shannon = 0;
        for (int i = 0; i < elements.length; i++) {
            double p = (double) elements[i] / (double) sequence.length;
            shannon += p == 0 ? 0 : -p * Math.log(p) / Math.log(2);
        }
        StdOut.printf("%.4f", shannon);
    }
}
