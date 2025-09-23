

public class CompositionExample {
    public static void main(String[] args) {
    Personel boss = new Personel("Betty", 34562, -9);
        System.out.println(boss.getAge());
        System.out.println(boss.toString());

    }
}

class Personel {
    private String name;
    private long identificationNumber;
    private int age;

    public Personel() {
        name = "The name has not been assigned yet.";
        identificationNumber = 0;
        age = 18;
    }

    public Personel(String name, long identificationNumber, int age) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18){
            this.age = age;
        } else
            this.age = 18;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "name='" + name + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", age=" + age +
                '}';
    }
}

class Student {
    private Personel personelFeature;
    private int schoolNo;

    public Student() {
        this.personelFeature = new Personel("The name has not been assigned.", 0, 18);
        this.schoolNo = 500;
    }

    public Student(Personel personelFeature, int schoolNo) {
        this.personelFeature = personelFeature;
        this.schoolNo = schoolNo;
    }

    public Personel getPersonelFeature() {
        return personelFeature;
    }

    public void setPersonelFeature(Personel personelFeature) {
        this.personelFeature = personelFeature;
    }

    @Override
    public String toString() {
        return "Student{" +
                "personelFeature=" + personelFeature +
                ", schoolNo=" + schoolNo +
                '}';
    }
}
