public class MemberInnerClassExample {
    public static void main(String[] args) {
      Calculater calculater = new Calculater();
      Calculater.Add add = calculater.new Add();
      Calculater.Substract substract = calculater.new Substract();
        System.out.println(add.add(5,2));
        int substractVariable = substract.substract(7, 9);
        System.out.println(substractVariable);
        System.out.println(calculater.multip(6,9));
        calculater.calculateSquare(5);

    }
}
