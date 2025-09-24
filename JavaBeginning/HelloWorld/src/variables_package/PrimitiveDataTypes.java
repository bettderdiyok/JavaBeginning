package variables_package;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int integerVariableValue = 10;
        double doubleVariableValue = 10.5;
        System.out.println("Byte min : " + Byte.MIN_VALUE + "\n" + "Byte max : " + Byte.MAX_VALUE + "\nBit? : " + Byte.SIZE );
        System.out.println("Short min : " + Short.MIN_VALUE + "\n" + "Short max : " + Short.MAX_VALUE + "\nBit? : " + Short.SIZE );
        System.out.println("Int min : " + Integer.MIN_VALUE + "\n" + "Int max : " + Integer.MAX_VALUE + "\nBit? : " + Integer.SIZE );
        char letter = 'a';
        System.out.println(letter);
        boolean isTrue = true;
        System.out.println(!isTrue);
        int value = 'A'; //ASCII
        System.out.println(value);




    }
}
