import java.util.Arrays;

public class Diagram {
    public static void main(String[] args) {
        double[] trials = { 1000.0, 2000.0, 4000.0, 8000.0, 16000.0 };
        double[] time = { 0.29, 2.22, 17.36, 138.31, 1252.70 };
        double[] logN = new double[trials.length];
        double[] logT = new double[time.length];
        for (int i = 0; i < trials.length; i++) {
            logN[i] = Math.log(trials[i]) / Math.log(2);
            logT[i] = Math.log(time[i]) / Math.log(2);
        }
        StdDraw.setXscale(9, 14);
        StdDraw.setYscale(-2, 11);

        for (int i = 0; i < logT.length; i++) {
            StdDraw.setPenRadius(0.001);
            StdDraw.setPenColor(StdDraw.BLACK);
            if (i > 0)
                StdDraw.line(logN[i - 1], logT[i - 1], logN[i], logT[i]);
            StdDraw.setPenRadius(0.02);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(logN[i], logT[i]);
        }
        StdOut.println(Arrays.toString(logN) + "\n" + Arrays.toString(logT));
    }
}
