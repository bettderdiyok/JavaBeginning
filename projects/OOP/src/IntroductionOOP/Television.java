package IntroductionOOP;

public class Television {
    private int channel;
    private int volume;
    private boolean isTurnOn;


    public void turnOnTV (){
        if (!isTurnOn) {
            System.out.println("The TV is being turned on");
            isTurnOn = true;
        }else {
            System.out.println("The television is already on ");
        }
    }

    public void turnOffTV (){
        if (isTurnOn){
            System.out.println("The TV is being turned off...");
            isTurnOn = false;
        } else{
            System.out.println("The TV is already off");
        }
    }

    public void setChannel(int newChannel){
        if(isTurnOn && newChannel>0 && newChannel<500){
            this.channel = newChannel;
        }else {
            System.out.println("The channel number should be between 0 and 500, and the tv should be on");
        }

    }

    public int getChannel() {
        return channel;
    }

    public void showTV() {
        System.out.println("The Tv is on " + isTurnOn + "\nThe Channel : " + channel + "\nVolume : " + volume);
    }
}
