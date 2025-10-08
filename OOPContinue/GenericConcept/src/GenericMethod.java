public class GenericMethod {
    public static void main(String[] args) {
        String[] names = {"Betty", "Selim", "Marla"};
        Integer[] numbers = {1, 4, 8, 9, 3};
        Character[] characters = {'a', 'h', 'l'};

        TryGenericMethod o1 = new TryGenericMethod();
        o1.printEvery(names);
        o1.printEvery(characters);
        TryGenericMethod.printEvery(numbers);
        TryGenericMethod.printEvery(numbers);
    }
}

class TryGenericMethod{
    public <T> void printEvery(T[] valueArray){
        for (T value : valueArray){
            System.out.println(value);

        }

    }

    public static <T extends Number> void printEvery(T[] valueArray){
        for (T value: valueArray) {
            System.out.println(value);
        }
    }
}