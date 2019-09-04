package nl.duo.javaklasje.dag1;

public class HelloWorld {
    public static void main(String [] args){
       minutenNaarTijd(531);
       minutenNaarTijd(854);
    }
    private static void minutenNaarTijd(int minuten){
        int uren=minuten/60;
        int minuut=minuten%60;

        System.out.println("Het is nu " + uren + ":"+ minuut);
    }

}
