public class MethodOverloading3 {
    /* public static void main(String[] args) {
         sum(5,9);//int int a karşılık gelen metot çalışır.
     }
     public static void sum(int a, int b){
         System.out.println("One Parameter ");
     }

     public static void sum(int a, double b){
         System.out.println("Two Parameter");
     }
 }
 */
    public static void main(String[] args) {
        sum(5,9.6);
    }

  public static void sum(int a, int b){
    System.out.println("One Parameter ");
}

    public static void sum(int a, double b){
        System.out.println("Two Parameter");
    }
    //Kendine uyanı çalıştırır.
}


  /*
   Burada hata verir çünkü 5.8 double değerini karşılayacak bir parametre yok
   public static void main(String[] args) {
        sum(5.8,9);
    }

    public static void sum(int a, int b){
        System.out.println("One Parameter ");
    }

    public static void sum(int a, double b){
        System.out.println("Two Parameter");
    }
}
*/
