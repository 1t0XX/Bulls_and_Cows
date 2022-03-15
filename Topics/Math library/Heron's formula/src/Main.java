import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double area = calculateArea(a, b, c);
        System.out.printf("%f", area);
    }

    public static double calculateArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0.0;
        } else {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }
}