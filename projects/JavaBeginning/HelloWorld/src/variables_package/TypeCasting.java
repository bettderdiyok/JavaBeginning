package variables_package;

public class TypeCasting {
    public static void main(String[] args) {
        int num = 10;
        double dotNum = 135.25f;
         num = (int) dotNum;
        //dotNum = num; //(implicit)
        System.out.println(num);
        System.out.println(((Object) dotNum).getClass().getName());
        byte byteNum = 5;
        byteNum = (byte) dotNum; // Hatalı en fazla 127 ye kadar alır o yüzden saçma ifade verir.
        System.out.println(byteNum);
    }
}
