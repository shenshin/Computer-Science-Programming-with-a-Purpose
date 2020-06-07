/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     22/5/2020
 **************************************************************************** */

public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] sample = new double[a.length];
        for (int i = 0; i < a.length; i++)
            sample[i] = a[i] * alpha;
        return sample;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] reversed = new double[a.length];
        for (int i = 0; i < a.length; i++)
            reversed[i] = a[a.length - 1 - i];
        return reversed;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merged = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++)
            merged[i] = a[i];
        for (int i = 0; i < b.length; i++)
            merged[a.length + i] = b[i];
        return merged;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] longer = a.length >= b.length ? a : b;
        double[] shorter = a.length == longer.length ? b : a;
        double[] mixed = new double[longer.length];
        // записываю в начало результирующего массива элементы короткого массива
        for (int i = 0; i < shorter.length; i++)
            mixed[i] = shorter[i];
        // складываю соответствующие элементы короткого и длинного массивов
        for (int i = 0; i < longer.length; i++)
            mixed[i] += longer[i];
        return mixed;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] newArr = new double[(int) ((double) a.length / alpha)];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = a[(int) ((double) i * alpha)];
        }
        return newArr;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {

        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] harp = StdAudio.read("harp.wav");
        double[] exposure = StdAudio.read("exposure.wav");

        StdAudio.play(merge(mix(changeSpeed(reverse(exposure), 1.5), amplify(piano, 0.1)),
                            mix(mix(beatbox, chimes), amplify(changeSpeed(harp, 0.2), 0.1))));

    }
}
