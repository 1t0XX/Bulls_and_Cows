import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] roots = solveQuadraticEquation(a, b, c);
        Arrays.stream(roots).sorted().forEach(e -> System.out.print(e + " "));
    }

    private static double[] solveQuadraticEquation(double a, double b, double c) {
        double[] roots = new double[2];
        // ax2 + bx + c = 0
        final double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        roots[0] = (-b - sqrt) / (2 * a);
        roots[1] = (-b + sqrt) / (2 * a);
        return roots;
    }
}