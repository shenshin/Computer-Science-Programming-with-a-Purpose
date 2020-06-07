/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Funcs {
    public static void main(String[] args) {
        double tempo = Double.parseDouble(args[0]);
        while (!StdIn.isEmpty()) {
            int pitch = StdIn.readInt(); // высота звука
            double duration = StdIn.readDouble() * tempo; // продолжительность звука
            double a[] = note(pitch, duration);
            // double[] a = tone(hz, duration);
            StdAudio.play(a);
        }

        StdAudio.close();
    }

    public static double[] note(int pitch, double duration) {
        double hz = frequency(pitch);
        double[] a = tone(hz, duration);
        double[] hi = tone(hz * 2, duration);
        double[] lo = tone(hz / 2, duration);
        // double[] harmonic = sum(hi, lo, 0.5, 0.5);
        // return sum(a, harmonic, 0.5, 0.5);
        double[] harmonic = average(hi, lo);
        return average(a, harmonic);
    }

    public static double[] chord(int pitch1, int pitch2, double duration) {
        double[] a = tone(frequency(pitch1), duration);
        double[] b = tone(frequency(pitch2), duration);
        return average(a, b);
    }

    public static double[] tone(double hz, double duration) {
        int N = (int) (StdAudio.SAMPLE_RATE * duration);
        double[] a = new double[N + 1];
        for (int i = 0; i <= N; i++)
            a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
        return a;
    }

    public static double frequency(int note) {
        return 440 * Math.pow(2, (double) note / 12);
    }

    public static void playNoise(int duration) {
        int N = StdAudio.SAMPLE_RATE * duration;
        double[] a = new double[N + 1];
        for (int i = 0; i <= N; i++)
            a[i] = Math.random();
        StdAudio.play(a);
    }

    public static double[] average(double[] a, double[] b) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = (a[i] + b[i]) / 2;
        return c;
    }

    public static double[] sum(double[] a, double[] b, double ca, double cb) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i] * ca + b[i] * cb;
        return c;
    }

}
