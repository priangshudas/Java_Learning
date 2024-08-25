public class Strings {
    public static void main(String[] args) {
        // Strings in java and most used methods
        String str = "Hello, World!";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.trim());
        System.out.println(str.substring(0, 5));
        System.out.println(str.isEmpty());

        String str1 = "Priangshu";
        String str2 = "Das";

        System.out.println(str1.concat(str2));
        System.out.println(str1.matches(str2));

        // Multiline string in java
        String strM = """
                Hello, World!
                This is a multiline string in java
                """;
        System.out.println(strM);

    }
}
