import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int minimumOfMax = Integer.MAX_VALUE;
        int currentMinSeed = 0;
        int randomNumber;

        for (int i = a; i <= b; i++){
            Random random = new Random(i);
            int currentMax = 0;
            for (int j = 0; j < n; j++){
                randomNumber = random.nextInt(k);
                if (randomNumber > currentMax){
                    currentMax = randomNumber;
                }
            }
            if (currentMax < minimumOfMax){
                minimumOfMax = currentMax;
                currentMinSeed = i;
            }
        }
        System.out.println(currentMinSeed);
        System.out.println(minimumOfMax);
    }
}