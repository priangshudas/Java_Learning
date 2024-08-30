public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Arithmetic operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational operators
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        //Ternery operators
        String ans = a % 2 == 0 ? "Even" : "Odd";
        System.out.println(ans);

        //Logical AND
        int age = 20;
        String citizenship = "Indian";

        if (age >= 18 && citizenship == "Indian"){
            System.out.println("Elegible for voting");
        }else {
            System.out.println("Not eligible for voting");
        }

        //Logical OR
        boolean knowPython = true;
        boolean knowJava = false;

        if (knowPython == true || knowJava == true){
            System.out.println("You are a programmer");
        }else {
            System.out.println("You are not a programmer");
        }

        //Logical NOT
        boolean flag = false;
        if (!flag){
            System.out.println("hello world");
        }
    }

}