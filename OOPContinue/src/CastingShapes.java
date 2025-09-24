public class CastingShapes {
    public static void main(String[] args) {
        // ✅ 1. Upcasting (alt sınıf nesnesi üst sınıf referansına atanıyor)
        GeometricShape shape1 = new Rectangle();
        shape1.draw(); // Rectangle çiziliyor (Polimorfizm)

        // ✅ 2. Upcasting başka bir örnek
        GeometricShape shape2 = new Square();
        shape2.draw(); // Square çiziliyor (Polimorfizm)

        // ✅ 3. Downcasting (üst sınıf referansını alt sınıfa çeviriyoruz)
        if (shape1 instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape1; // güvenli downcasting
            rect.calculateArea();
        }
        // ✅ 4. Yanlış downcasting örneği (kontrol etmezsek hata olur!)
        if (shape2 instanceof Rectangle) {
            Rectangle wrongCast = (Rectangle) shape2; // ❌ bu satır çalışmaz çünkü shape2 gerçekte Square
            wrongCast.calculateArea();
        } else {
            System.out.println("shape2 Rectangle değil, cast edilemez!");
        }

    }
}

class GeometricShape {
    public void draw() {
        System.out.println("Bir geometrik şekil çiziliyor...");
    }
}

class Rectangle extends GeometricShape {
    @Override
    public void draw() {
        System.out.println("Dikdörtgen çiziliyor...");
    }

    public void calculateArea() {
        int width = 10, height = 5;
        System.out.println("Dikdörtgen alanı = " + (width * height));
    }
}

class Square extends GeometricShape {
    @Override
    public void draw() {
        System.out.println("Kare çiziliyor...");
    }

    public void calculateArea() {
        int side = 6;
        System.out.println("Karenin alanı = " + (side * side));
    }
}
