package OOP;

public class Constructor {
    public static void main(String[] args) {
        NewCar[] carr={new NewCar("Blue","TOGG", 1000000, 2023),
                       new NewCar("Pink", "BMW" ,23435234, 2020),
                       new NewCar("Green", "RENAULT", 587896, 2017)};
        System.out.println(carr[0].color);
        System.out.println(carr[2].yearOfProduction);
        for (NewCar x:carr ) {
            System.out.printf("Brand=%s  Color=%s Price=%f Year of Production=%d\n", x.brand, x.color, x.price, x.yearOfProduction );
            //carr dizisindeki her bir elemanın rengini bize verir.
        }
     /* NewCar car1 = new NewCar("Blue","TOGG", 1000000, 2023);
        NewCar car2 = new NewCar("Pink", "BMW" ,23435234, 2020);
        NewCar car3 = new NewCar("Green", "RENAULT", 587896, 2017);
*/

       /* NewCar[] carr= new NewCar[3];
        carr[0]=car1;
        carr[1]=car2;
        carr[2]=car3;
        */

      /*  NewCar[] carr={car1, car2, car3};
        System.out.println(carr[1].color);
        System.out.println(car1.color);
        System.out.println(car2.brand);
        System.out.println(car3.yearOfProduction);
        car1.sayPrice();
*/



    }
}
