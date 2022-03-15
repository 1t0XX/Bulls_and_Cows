import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        int u2 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        Vector u = new Vector(u1, u2);
        Vector v = new Vector(v1, v2);

        double angle = calculateAngle(u, v);
        System.out.println(angle);
    }

    private static double calculateAngle(Vector u, Vector v) {
        double product = dotProduct(u, v);
        double lengthU = u.length();
        double lengthV = v.length();

        double cos = product / (lengthU * lengthV);

        return Math.toDegrees(Math.acos(cos));
    }

    private static double dotProduct(Vector u, Vector v) {
        return u.getX() * v.getX() + u.getY() * v.getY();
    }

}

class Vector {
    private final double x;
    private final double y;

    Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}