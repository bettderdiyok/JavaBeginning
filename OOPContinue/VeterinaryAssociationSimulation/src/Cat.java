public class Cat extends Animal {
    private String species;
    private String breed;
    public Cat(String birthdayTime, boolean isRegister, String breed) {
        super(birthdayTime, isRegister);
        this.species = "Cat";
        this.breed = breed;

    }
    @Override
    void showInfo() {
        System.out.println(toString() + super.toString());

    }

    @Override
    public String toString() {
        return "Cat{" +
                "species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
