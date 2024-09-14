import java.util.Scanner;

public class While_loops {
    public static void main(String[] args) {
        // while loop
        // print 1 to 10 numbers
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        // count the number of digits in a number
        int num = 123456;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println();
        System.out.println(count);

        // do while loop
        // print 1 to 10 numbers
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 10);

        System.out.println(10);
        // sum of positive numbers
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num1 = 1;
        while (num1 > 0) {
            sum += num1;
            System.out.print("Enter a number: ");
            num1 = scanner.nextInt();
        }
        System.out.println("Sum of positive numbers: " + sum);

        // break statement
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }

        // continue statement
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                continue;
            }
            System.out.println(l);
        }

        // random number game
        // Generate a random number between 1 and 10
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println("A random number between 1 and 10 has been generated.");

        Scanner input = new Scanner(System.in);
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        input.close();
    }
}
