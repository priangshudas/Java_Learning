import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age - ");
        int age = sc.nextInt();

        if (age == 0 || age < 0) {
            System.out.println("Please enter a valid age");
        } else if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}