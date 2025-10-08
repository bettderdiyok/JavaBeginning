public class AnonymousClass {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.add(4,7);
        /* NewCalculater newCalculater = new NewCalculater();
        newCalculater.add(5,7);

         */
//Anonymous
        Calculate calculater = new Calculate(){
            @Override
            public void add(int n1, int n2) {
                System.out.println("Adding two numbers:");
                super.add(n1, n2);
            }
        };
        calculater.add(6,8);
    }
}

class NewCalculater extends Calculate {
    @Override
    public void add(int n1, int n2) {
        System.out.println("Adding two numbers:");
        super.add(n1, n2);
    }
}