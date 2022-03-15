import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int temp = array[size-1];
        for (int i = size-1; i >= 0; i--){
            if (i == 0){
                array[i] = temp;
            } else {
                array[i] = array[i-1];
            }
        }

        for (int i : array){
            System.out.print(i + " ");
        }
    }
}