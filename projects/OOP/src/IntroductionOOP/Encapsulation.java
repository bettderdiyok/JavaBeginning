package IntroductionOOP;

public class Encapsulation {
  private int studentNo;
  private String name;
  private byte studentClass;
  private boolean isActive;

    public Encapsulation(int studentNo, String name, byte studentClass, boolean active) {
        this.studentNo = studentNo;
        this.name = name;
        this.studentClass = studentClass;
        this.isActive = active;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentClass(byte studentClass) {
        this.studentClass = studentClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Encapsulation() {

    }

    public void printStudentInformation(){
        if (isActive) {
            System.out.println("Name : " + name + "\nschool no: " + studentNo + "\nClass :" + studentClass);
        } else {
            System.out.println("This student is not active");
        }

    }
}
