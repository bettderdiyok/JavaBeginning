public class Calculater {
    void calculateSquare(int number){
        class Square {
            int getSquare(){
                return number * number;
            }
        }
        Square square = new Square();
        System.out.println(square.getSquare());

    }

    public int multip(int i, int j){
        Multiply multiply = new Multiply();
        return multiply.multiply(i, j);


    }
   public class Add{
       public int add(int i, int j){
           return i + j;
       }
   }

   class Substract {
       public int substract(int i, int j){
           return i-j;
       }
   }

    private class Multiply {
        public int multiply(int i, int j){
            return i*j;
        }
    }

    class Divide {
        public String divide(int i, int j){
            if (j == 0){
                System.out.println("The divisor can't be zero");
                return "";
            }else {
                int result = i/j;
                return String.valueOf(result);
            }
        }
    }






}
