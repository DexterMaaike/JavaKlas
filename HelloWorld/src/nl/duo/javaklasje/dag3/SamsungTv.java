package nl.duo.javaklasje.dag3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SamsungTv implements Television {
    private boolean tvIsOn;
    private int currentChannel;
    private int currentVolume;

    List<String> channels = new ArrayList<>();


    public void printChannelWithA(){
        channels.stream().filter(s -> s.contains("a")).forEach(System.out::println);
    }

    @Override
    public void tvOn() {
        if (tvIsOn) {
            System.out.println("Television is already on");
        } else {
            tvIsOn = true;
        }
    }

    @Override
    public void tvOff() {
        if (!tvIsOn) {
            System.out.println("Television is already off");
        } else {
            tvIsOn = false;
        }

    }

    @Override
    public int switchChannel(int newChannel) {
        currentChannel = newChannel;
        System.out.println("The channel is now " + currentChannel);
        return currentChannel;
    }

    @Override
    public int changeVolume(boolean higher) {
        if (higher) {
            currentVolume++;
        } else {
            currentVolume--;
        }
        System.out.println("The current volume is " + currentVolume);
        return currentVolume;
    }
}
