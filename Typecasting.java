public class Typecasting {
    public static void main(String[] args) {
        // Widening/Implicit Typecasting (done by java)
        int i = 10;
        double d = i; // implicit typecasting
        System.out.println("Value of d: " + d); // Output: 10.0

        // Explicit typecasting (manually by programmer)
        double d1 = 10.5;
        int i1 = (int) d1; // explicit typecasting
        System.out.println("Value of i1: " + i1); // Output: 10

    }
}
