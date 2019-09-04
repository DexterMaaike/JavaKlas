package nl.duo.javaklasje.carcase.Exceptions;

public class TankOverfillException extends Exception {

    public TankOverfillException(){
    }

    public TankOverfillException(String message){
        System.out.println(message);
    }
}
