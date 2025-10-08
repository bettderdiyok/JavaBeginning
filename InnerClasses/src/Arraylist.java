import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Phone phone1 = new Phone("Mi 8 ", 3000);
        Phone phone2 = new Phone("Mate 10 Pro ", 5000);
        Phone phone3 = new Phone("Iphone ", 10000);
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);

        System.out.println(phones.size());
        for (Phone phone : phones) {
            System.out.println(phone);
        }
        System.out.println();
        phones.add(phone1);
        phones.add(0,phone3);
        for (Phone phone : phones) {
            System.out.println(phone);
        }

    }
}

class Phone {
    String brand;
    int price;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone {" +
                "brand : " + brand +
                 "price : " + price;
    }
}
