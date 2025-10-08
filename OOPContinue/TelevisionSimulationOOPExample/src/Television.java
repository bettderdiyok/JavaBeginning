import javax.swing.*;
import java.util.ArrayList;

public class Television {
 private String brand;
 private String  size;
 private boolean isTurnOn;
 private int volume;
 private final ArrayList<Channel> channels;
 private Channel activeChannel;
 private String activeChannelName;


    public Television(String brand, String size) {
        this.brand = brand;
        this.size = size;
        this.isTurnOn = false;
        volume = 10;
        channels = new ArrayList<>();
        createChannels();
        activeChannel = channels.getFirst();
        activeChannelName = channels.getFirst().getName();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    private void createChannels() {
        NewsChannel cnn = new NewsChannel("CNN", 1, "General news");
        channels.add(cnn);
        NewsChannel bein = new NewsChannel("BeinSport", 2, "Sport");
        channels.add(bein);
        MusicChannel powerturk = new MusicChannel("PowerTürk", 3, "Native");
        channels.add(powerturk);
        MusicChannel numberOne = new MusicChannel("NumberOne", 4, "Foreign");
        channels.add(numberOne);
    }

    public void changeChannel(int requestedChannel){
        if (isTurnOn) {
            if (requestedChannel < channels.size() && requestedChannel >= 0) {
                if (channels.get(requestedChannel).getChannelNo() == activeChannel.getChannelNo()) {
                    System.out.println("The " + activeChannel.getName() + " already is on");
                }else {
                    activeChannel = channels.get(requestedChannel);
                    activeChannelName = channels.get(requestedChannel).getName();
                    System.out.println("The current channel is " + activeChannelName);
            }
            }
            else {
                System.out.println("An invalid channel number");
            }

        }else {
            System.out.println("Turn on the TV before");

        }
    }

    public void showTheCurrentChannel(){
        if (isTurnOn) {
            System.out.println("The current channel is " + activeChannelName);
        }else {
            System.out.println("Turn on the tv before");
        }
    }





    public void turnOnTV(){
        if (isTurnOn == false) {
            isTurnOn = true;
            System.out.println("The tv is being turned on.");
        }else
            System.out.println("The tv is already on");
    }

    public void turnOffTV(){
        if(isTurnOn) {
            isTurnOn = false;
            System.out.println("The tv is being turned off.");
        }else {
            System.out.println("The tv is aldready off.");
        }
    }

    public void turnUpVolume(){
        if(volume <= 20 && isTurnOn){
            volume++;
            System.out.println("Volume : " + volume);
        }else {
            System.out.println("The volume is already at maximum, you can't increase it further and tv is off.");
        }
    }

    public void turnDownVolume(){
        if(volume > 0 && isTurnOn){
            volume--;
            System.out.println("Volume : " + volume);
        }else {
            System.out.println("The volume is already at minimum, you can't decrease it further and tv is off");
        }
    }


    @Override
    public String toString() {
        return "Brand of the TV :" + getBrand() + "\nSize of the TV :" + getSize();
    }
    
}
