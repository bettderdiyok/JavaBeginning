package variables_package;

public class Scope {
    public static void main(String[] args) {
        int levelBlock1 = 1;
        {
            System.out.println(levelBlock1);
            int levelBlock2 = 21; {
            System.out.println(levelBlock1);
            System.out.println(levelBlock2);
            int levelBlock3 = 31; {
                System.out.println(levelBlock1);
                System.out.println(levelBlock2);
                System.out.println(levelBlock3);
            }
        }
        }
    }
}
