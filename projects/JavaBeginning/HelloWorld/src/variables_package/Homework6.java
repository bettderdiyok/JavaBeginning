package variables_package;

public class Homework6 {
    public static void main(String[] args) {
        int increase = 0;
        boolean isIncrease = true;
        for (int i=1; i<=35; i+=increase) {
            System.out.println(i + ",");
            if(increase <=4 && isIncrease == true) {
                increase++;
                if (increase == 5) {
                    isIncrease = false;
                }
            }
                else  {
                    increase--;
                    if(increase == 1) {
                        isIncrease = true;
                    }
                }
            }

        }



        }

