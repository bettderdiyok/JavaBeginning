package IntroductionOOP;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student((byte) 3, 1234, "Betty", true);
        Encapsulation student2 = new Encapsulation();
        Television tv1 = new Television();
        student2.printStudentInformation();
        student2.setStudentNo(30);
        student2.setActive(true);
        student2.printStudentInformation();
        System.out.println(student2.getStudentNo());

        tv1.turnOnTV();
        tv1.turnOffTV();
        tv1.setChannel(30);
        System.out.println("Channel : " + tv1.getChannel());



      /*  ClassAndObject student = new ClassAndObject();
        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.schoolNumber);
        student.enrollStudent();

       */
      /*  ClassAndObjectConstructor value = new ClassAndObjectConstructor();
        System.out.println(value.brand);
        System.out.println(value.speed);

       */
       /* ClassAndObjectConstructor value2 = new ClassAndObjectConstructor("BMW", 140);
        System.out.println(value2.brand);
        System.out.println(value2.speed);

        */
    }

}
