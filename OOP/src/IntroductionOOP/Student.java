package IntroductionOOP;

public class Student {
    int studentNo;
    String name;
    byte studentClass;
    boolean isActive;

    public Student (int studentNo) {
        this.studentNo = studentNo;

    }
    public Student (int studentNo, String name) {
        //this.studentNo = studentNo;
        this(studentNo);
        this.name = name;
    }

    public Student (int studentNo, String name, byte studentClass) {
     /*   this.studentNo = studentNo;
        this.name = name;

      */
        this(studentNo, name);
        this.studentClass = studentClass;
    }


    public Student(byte studentClass, int studentNo, String name, boolean isActive) {
        /* this.studentClass = studentClass;
        this.studentNo = studentNo;
        this.name = name;
         */
        this(studentNo, name, studentClass);
        this.isActive = isActive;
    }


    public void takeAlesson(){
        System.out.println("The student is taking a lesson ");
    }
    public void printStudentInformation(){
        if (isActive) {
            System.out.println("Name : " + name + "\nschool no: " + studentNo + "\nClass :" + studentClass);
        } else {
            System.out.println("This student is not active");
        }

    }
}
