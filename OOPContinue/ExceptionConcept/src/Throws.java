public class Throws {
        public static void main(String[] args) {
            try {
                checkAge(15);
            } catch (Exception e) {
                System.out.println("Hata yakalandı: " + e.getMessage());
            }
        }

    public static void checkAge(int age) throws Exception {
            if (age < 18) {
                throw new Exception("Yaş 18'den küçük olamaz!");
            }
            System.out.println("Giriş başarılı!");
        }
    }

