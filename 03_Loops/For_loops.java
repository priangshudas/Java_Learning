import java.util.Scanner;

public class For_loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        // print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // print numbers from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // largest of n numbers with dynamic user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] n = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }

        int largest = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > largest) {
                largest = n[i];
            }
        }
        System.out.println("Largest number is " + largest);
    }

}
