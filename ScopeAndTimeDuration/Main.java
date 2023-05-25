public class Main {
    static int a=20;
    public static void main(String[] args) {
        double x=10;
        //main metodu
      /*  Bu kod hatalıdır çünkü değişken tanıtıldığı satırdan itibaren hayattadır.
        System.out.println(x);
        int x = 20;
       */

        /*
        Burada bir initialized hatası alırız.
        int x;
        System.out.println(x);
         */

        //class düzeyinde tanımlanmış değişkenler class içerisindeki tüm mtodlarda kullanılabilir.
        System.out.println("bu kısım main metodu içinden yazdırıldı " + a);
        a=3;
        write();
        System.out.println(a);
        read(5, 6);
        read(4, 5, 6);

       /* tanıdıldığı parametre olarak verildiği metot da çalışır.
         System.out.println(var1 + var2);

        */

    }
        public static void write() {
        //write metodu
            System.out.println("Bu kısım yazdır metodu içinden yazdırıldı " + a);
            a=300;
         //   System.out.println(x); Bir metot içinde tanımlanan değer başka bir metot içinde kullanılamaz.

        }

        public static void read(int var1, int var2){
            System.out.println(var1 + " and " + var2);
            System.out.println(var1 + var2);

        }

        public static void read(int var1, int var2, int var3){
            System.out.println(var1 + var2);

        }


}


