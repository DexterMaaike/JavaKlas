package nl.duo.javaklasje.dag3;

import java.util.Arrays;

public class TelevisionApp {
    public static void main(String[] args) {
        SamsungTv tvtje = new SamsungTv();
        tvtje.tvOn();
        tvtje.changeVolume(true);
        tvtje.switchChannel(12);
        tvtje.tvOn();
        tvtje.tvOff();
        String[] channelArray = {"NPO1", "NPO2", "RTL4", "SBS6", "Veronica", "Talpa"};
        tvtje.channels.addAll(Arrays.asList(channelArray));
        tvtje.printChannelWithA();
    }
}
