public class Generator {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        int iterations = Integer.parseInt(args[1]);
        generate(range, iterations);
    }

    // создаёт и выводит в поток вывода случайные числа в диапазоне range
    // [ -n ; n ] в количестве iterations
    private static void generate(int range, int iterations) {
        for (int i = 0; i < iterations; i++)
            StdOut.println(StdRandom.uniform(-range, range));
    }
}
