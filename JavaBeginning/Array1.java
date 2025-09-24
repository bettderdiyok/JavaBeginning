public class Main {
    public static void main(String[] args) {
        int [] newArray;
        newArray = new int[8];
        int [] firstArray = new int[5];
        int [] secondArray = new int[5];
        double [] thirdArray = new double[5];
        double [] price = {45.7, 23.5, 67.4, 3.4, 67, 10, 8, 9};
        String [] cars = {"Mercedes", "BMW", "Audi"};
        secondArray[0] = 4;
        secondArray[4] = 100;
        for(int i=0; i< secondArray.length; i++){
            System.out.print(secondArray[i] + " ");
        }

        System.out.println();
        for(int i=0; i< firstArray.length; i++){
            firstArray[i]=(int)(Math.random() * 5 + 1);
        }

        for(int i=0; i< firstArray.length; i++){
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for(int i=0; i< thirdArray.length; i++){
            System.out.print(thirdArray[i] + " ");
        }
        System.out.println();
        for(int i=0; i< price.length; i++){
            System.out.print(price[i] + " ");
        }
        System.out.println();
        System.out.println((int)price[4]);
        System.out.println(price.length);
        System.out.println(cars[0]);




    }
}
