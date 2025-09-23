package variables_package;

public class Loops {
    public static void main(String[] args) {
       externalFor:
        for (int a=0; a<5; a++) {
            internalFor:
            for (int b=0; b<3; b++) {
                System.out.println("a:" + a + "b" + b);
                if( a == 1 && b == 2) {
                    break externalFor;
                }

            }

        }

    }
}
