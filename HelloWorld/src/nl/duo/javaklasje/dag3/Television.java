package nl.duo.javaklasje.dag3;

public interface Television {
    void tvOn();
    void tvOff();
    int switchChannel(int newChannel);
    int changeVolume(boolean higher);

}
