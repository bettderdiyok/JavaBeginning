public class Main2 {
    public static void main(String[] args) {

    /* for(int i=1; i<10; i++) {
         System.out.println(i);
     }
        System.out.println(i); Hata verir .


     */
        int i;
        for(i=1; i<10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(i);
        int a;// bu olmasaydı aşağıdaki parantezli alanda olsaydı.
        {
            //Bu parantezin başladığı ve bittiği yerde bir yaşam başlattık.Bu parantez bittiğinde de a değişkeninin yaşamı biter.
             a=20;
            a++;
            System.out.println(a);
        }
        System.out.println(a);

     //   System.out.println(a); Hata verirdi.
        int x=0;
        while(x<10) {
            System.out.println(x);
            x++;
        }
        System.out.println(x);

        {
            int t=20;
            {
                int y=15;
                t=50;
                System.out.println(t);
                System.out.println(y);
            }

            System.out.println(t);
          //  System.out.println(y);  Hata verir çünkü yaşam alanı bu bölgede değil iç parantezlerde
        }

       int temp=0;
        for(int k=1; k<10; k++){
            temp=5;
            temp*=k;
        }
        System.out.println(temp);



        for(int p=0; p<10; p++) {
            int temp2=5;
            if(p%3==0) {
                temp2*=p;
            }
        }
      // System.out.println(temp2); Hata!

        if (true) { // yeni yaşam alanı başlar
            int s = 20; // sadece bu alanda tanınır.
            System.out.println("s: " + s);
        }
      //  s = 100; Hata! y burada tanınmıyor.
    }



}
