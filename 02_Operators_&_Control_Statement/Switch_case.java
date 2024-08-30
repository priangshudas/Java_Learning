public class Switch_case {
    public static void main(String[] args) {
        int day = 3;
        int month = 2;
        // Clasic switch case whith breake statement
        switch (day) {
            case 1:
                System.out.println("Its day 1");
                break; // this is breake statement it used to stop furter traversal
            case 2:
                System.out.println("Its day 2");
                break;
            case 3:
                System.out.println("Its day 3");
                break;
            case 4:
                System.out.println("Its day 4");
                break;
            default: // this is the defailt case which is executed if none of the cases matched
                System.out.println("Its not a valid day");
        }

        // Enhanced switch case without the need of breake statement
        switch (month) {
            case 1 -> {
                System.out.println("January");
            }
            case 2 -> {
                System.out.println("February");
            }
            case 3 -> {
                System.out.println("March");
            }
            case 4 -> {
                System.out.println("April");
            }
            case 5 -> {
                System.out.println("May");
            }

            default -> {
                System.out.println("Its not a valid day");
            }

        }
    }
}