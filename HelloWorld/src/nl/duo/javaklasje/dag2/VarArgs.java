package nl.duo.javaklasje.dag2;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(smallestNum(1,2,3,4,5,6,7,8,9,0,11,13));
    }

    private static int smallestNum(int first, int ... numbers){
        int min = first;
        for(int num: numbers ){
            if (num<min){
                min=num;
            }
        }
        return min;
    }
}
