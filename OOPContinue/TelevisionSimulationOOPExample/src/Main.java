import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    static Television tv;
    static int channelNumber = 1;

    public static void main(String[] args) {
        int choise;
        showTheMenu();
        do {
            System.out.println("Make your choice:");
            choise = input.nextInt();
            switch (choise) {
                case 0:
                    System.out.println("Logged out of the system.");
                    break;
                case 1:
                    setUpTheTVandCreateChannels();
                    System.out.println("You can turn on the TV from now on");
                    break;
                case 2:
                    turnOnTV();
                    break;
                case 3:
                    turnUpVolume();
                    break;
                case 4:
                    turnDownVolume();
                    break;
                case 5:
                    System.out.println("Press 0 if you want to go to a specific channel, or press 1 if you want to zap and to exit press -1.");
                    int zapOrChannel = input.nextInt();
                    if(zapOrChannel == 0){
                        System.out.println("Enter the channel number you want to change:");
                        channelNumber = input.nextInt();
                        changeChannel(--channelNumber);
                    }else {
                        while(zapOrChannel == 1){
                            changeChannel(channelNumber++);
                            System.out.println("Your choice: ");
                            int zapChoice = input.nextInt();
                            if(zapChoice == -1) {
                                break;
                            }
                        }

                    }
                    break;
                case 6:
                    showTheCurrentChannel();
                    break;
                case 7:
                    turnOffTV();
                    break;
                case 8:
                    showTheMenu();
                    break;
                default:
                    System.out.println("Enter a value between 0 and 8");
                    break;
            }

        } while (choise != 0);

    }

    private static void setUpTheTVandCreateChannels() {
        input.nextLine();
        if (tv == null) {
            System.out.print("Enter your television's brand:");
            String brandTv = input.nextLine();
            System.out.print("Enter your television's size:");
            String sizeTV = input.next();
            tv = new Television(brandTv, sizeTV);
        } else {
            System.out.println("A TV object has been created. ");
        }
        System.out.println(tv.toString());

    }

    private static void showTheMenu() {
        System.out.println("-------MENU---------");
        System.out.println("0 -- Exit\n" +
                "1 -- Set up the TV\n" +
                "2 -- Turn on the TV\n" +
                "3 -- Turn up the TV volume\n" +
                "4 -- Turn down the TV volume\n" +
                "5 -- Change the channel\n" +
                "6 -- Show the current channel\n" +
                "7 -- Turn off the TV\n" +
                "8 -- Show the menu again");
    }

    private static void turnOnTV() {
        if (tv != null) {
            tv.turnOnTV();
        } else
            System.out.println("Please set up the TV first");
    }

    private static void turnOffTV(){
        if(tv != null) {
            tv.turnOffTV();
        } else {
            System.out.println("Please set up the TV first");
        }
    }
    private static void turnUpVolume(){
        if(tv != null) {
            tv.turnUpVolume();
        } else {
            System.out.println("Please set up the TV first");
        }
    }
    private static void turnDownVolume(){
        if(tv != null) {
            tv.turnDownVolume();
        } else {
            System.out.println("Please set up the TV first");
        }
    }

    private static void changeChannel(int channelNum){
        if(tv != null) {
            tv.changeChannel(channelNum);
        } else {
            System.out.println("Please set up the TV first");
        }
    }

    private static void showTheCurrentChannel(){
        if(tv != null) {
            tv.showTheCurrentChannel();
        } else {
            System.out.println("Please set up the TV first");
        }
    }


}