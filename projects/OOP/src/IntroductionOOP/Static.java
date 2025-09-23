package IntroductionOOP;

public class Static {
    public static void main(String[] args) {
        Officer o1 = new Officer();
        Officer o2 = new Officer();
        Officer o3 = new Officer();
        o1.setName("Cabel");
        o1.setSalary(4000);

        o2.setName("July");
        o2.setSalary(8000);

        o3.setName("Angel");
        o3.setSalary(12000);
        o3.showInfo();

        Officer.sayTheLaw();


    }
}

class Officer {
    private String name;
    private int salary;
   // private int createdOfficerObject; //default instance her nesneye özel
    private static int createdOfficerObject;
    public Officer() {
        createdOfficerObject++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if(salary < 0) {
            salary = 0;
        }else {
            this.salary = salary;
        }

    }

    public void showInfo(){
        System.out.println("Created Officer Object: " + createdOfficerObject);
        sayTheLaw();

    }

    public static void sayTheLaw(){
        System.out.println("Law No. 657 is valid.");

    }
}
