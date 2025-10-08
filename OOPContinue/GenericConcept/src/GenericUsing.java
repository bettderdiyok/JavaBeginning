public class GenericUsing {
    public static void main(String[] args) {
        String[] names = {"Betty", "Marla", "Hanna"};
        Integer[] numbers = {1, 5, 7, 9, 10};
        Character[] characters = {'a', 'b', 'k'};
        PrintGenericArray<String> stringPrintGenericArray = new PrintGenericArray<>();
        stringPrintGenericArray.print(names);
        PrintGenericArray<Integer> integerPrintGenericArray = new PrintGenericArray<>();
        integerPrintGenericArray.print(numbers);
        PrintGenericArray<Character> characterPrintGenericArray = new PrintGenericArray<>();
        characterPrintGenericArray.print(characters);

        PrintStringArray.print(names);
        PrintCharArray.printChar(characters);




    }
}
