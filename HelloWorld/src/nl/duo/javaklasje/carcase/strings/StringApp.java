package nl.duo.javaklasje.carcase.strings;

public class StringApp {

    public static void main(String[] args) {

        String c = "Compute";
        String d = "r";

        String result = "Computer";

        String concat = c + d;

        System.out.println(concat);

        System.out.println(concat.equals(result));

        StringBuilder b = new StringBuilder();

        b.append(c);
        b.append(d);
        String computer = b.toString();

        System.out.println(computer.equals("Computer"));
        // SHOULD BE true!!!

        //Bonus
        // Explain why this prints "false"
        System.out.println(computer == result);

        // Explain why it is invalid / VERY BAD to compare two Strings with the '=='- operator

    }
}

