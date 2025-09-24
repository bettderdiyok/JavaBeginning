class Superclass {
    public static void hello() {
        System.out.println("Hello from Superclass");
    }
}

class Subclass extends Superclass {
    public static void hello() {
        System.out.println("Hello from Subclass");
    }
}

public class BindingTypes {
    public static void main(String[] args) {
        Superclass.hello();   // Superclass versiyonu
        Subclass.hello();     // Subclass versiyonu

        Superclass obj = new Subclass();
        obj.hello();          // ❗ Superclass versiyonu (compile-time’da bağlanır)
    }
}

/*
Görüyor musun? obj aslında Subclass nesnesi ama hello() çağrısı Superclass’a gitti.
Çünkü static metodlar early binding → referans tipine göre belirlenir.
*/
