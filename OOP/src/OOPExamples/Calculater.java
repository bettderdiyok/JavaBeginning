package OOPExamples;



public class Calculater {
    public static int sum(int... parameters){
        int sum = 0;
        for (int parameter: parameters){
            sum += parameter;
        }
        return sum;
    }

    public static int substraction(int... parameters){
        int	difference = parameters[0];
        for (int i=1; i<parameters.length; i++) {
            difference = difference - parameters[i];
        }
        return difference;
    }

    public static int multiple(int... parameters) {
        int multip = 1;
        for (int num : parameters) {
            multip *= num;
        }
        return multip;
    }

    public static double divide(int... parameters) {
      int division = parameters[0];
      for (int i =1; i<parameters.length; i++) {
          if(parameters[i] != 0){
              division /= parameters[i];
          }else {
              System.out.println("You can't divide by zero ");
              return -1;
          }

      }
      return division;

    }

}
