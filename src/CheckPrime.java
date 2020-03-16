import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        System.out.printf("enter a number");
        int number = scanner.nextInt();
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d is a prime", number);
            } else {
                System.out.printf("%d is not a prime", number);
            }
        } else {
            System.out.printf("%d is not prime", number);
        }
    }
}
