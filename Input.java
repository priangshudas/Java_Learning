import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = inp.nextLine();
        System.out.println("Hello, " + name);
    }
}
