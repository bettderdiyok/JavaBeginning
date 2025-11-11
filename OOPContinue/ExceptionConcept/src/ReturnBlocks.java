public class ReturnBlocks {
    public static void main(String[] args) {
        System.out.println(stringReturn());
    }

    private static String stringReturn() {
        String hello = "Hello";
        try {
            hello = hello + " try";
            ArithmeticException exception = new ArithmeticException();
            throw exception;

        }catch (Exception e) {
            hello = hello + " catch";
            return hello;

        } finally {
            hello = hello + " finally";
            return hello;
        }

    }
}
