import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        try {
            String[] line = scanner.nextLine().split(" ");
            long K = Long.parseLong(line[0]);
            long N = Long.parseLong(line[1]);
            double M = Double.parseDouble(line[2]);
            long seed = K;
            Random random;
            boolean found = false;
            while (!found) {
                random = new Random(seed);
                for (int i = 1; i <= N; ) {
                    if (random.nextGaussian() <= M) {
                        if (i == N) {
                            found = true;
                        }
                        i++;
                    } else {
                        seed++;
                        break;
                    }
                }
            }
            System.out.println(seed);
        } catch (NumberFormatException nfe) {
            System.out.println("You must input numbers");
        }
    }
}