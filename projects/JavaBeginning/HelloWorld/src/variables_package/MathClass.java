package variables_package;

public class MathClass {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.abs(-7));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.ceil(5.2));
        System.out.println(Math.ceil(-3.4));
        System.out.println(Math.sqrt(25));
        int randomNumber = (int)(Math.random() * 10 + 1);
        System.out.println(randomNumber);


        for (int i=0; i<10; i++) {
            int randomNumberUntil2 = (int)(Math.random() * 20 + 1);
            System.out.println(randomNumberUntil2);
        }

        //Üretilecek rastgele sayının 0 da olmasını istiyorsak
        //Math.random * (üstsınır+1)
       // İstemiyorsan
        //Math.random * üstsınır+1




        //abs(x) -> Mutlak değer

    }
}
