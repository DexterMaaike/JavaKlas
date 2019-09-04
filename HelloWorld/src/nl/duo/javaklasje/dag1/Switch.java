package nl.duo.javaklasje.carcase;

public class Switch {
    public static void main(String[] args) {
        System.out.println(feedback("B"));
    }

    private static String feedback(String grade){
        String text = "";
        switch (grade){
            case "A":
                text = "Excellent";
                break;
            case "B":
                text = "Goed werk, topper";
                break;
            case "C":
                text = "kon beter";
                break;
            case "F":
                text = "kom nog eens terug";
                break;
                default:
                    System.out.println("geen geldige waarde opgegeven");
        }
        return text;
    }
}
