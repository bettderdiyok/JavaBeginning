public class Dog extends Animal {
    private int vaccinationNumber;

    public Dog(String birthdayTime, boolean isRegister, int vaccinationNumber) {
        super(birthdayTime, isRegister);
        this.vaccinationNumber = vaccinationNumber;
    }

    public int getVaccinationNumber() {
        return vaccinationNumber;
    }

    public void setVaccinationNumber(int vaccinationNumber) {
        if (vaccinationNumber > 0)
        this.vaccinationNumber = vaccinationNumber;
        else
            System.out.println("The vaccination number cannot be negative!!!");
    }

    @Override
    void showInfo() {
        System.out.println(toString() + super.toString());

    }

    @Override
    public String toString() {
        return "Dog{" +
                "vaccinationNumber=" + vaccinationNumber +
                '}';
    }
}
