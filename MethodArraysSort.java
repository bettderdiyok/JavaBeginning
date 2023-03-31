public class MethodArraysSort {
    public static void main(String[] args) {
        int[] array1 ={2, 4, 6, 8, 10, 12, 14, 16};
        String[] str={"java", "python", "C", "C++"};
       /* for(int i=0; i<array1.length; i++){
            System.out.println(array1[i]);
            }
        */
        for(int i:array1)
            System.out.println(i);
        //Bu kod yukarıdaki ile aynı işi yapıyor.

        //Aşağıdakini kullan
        for(String s:str)
            System.out.println(s);
        }


    }

