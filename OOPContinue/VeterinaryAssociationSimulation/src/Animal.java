import java.util.ArrayList;

public abstract class Animal {
    private String birthdayTime;
    private boolean isRegister;


    public Animal(String birthdayTime, boolean isRegister) {
        this.birthdayTime = birthdayTime;
        this.isRegister = isRegister;
    }

    public String getBirthdayTime() {
        return birthdayTime;
    }

    public void setBirthdayTime(String birthdayTime) {
        this.birthdayTime = birthdayTime;
    }

    public boolean isRegister() {
        return isRegister;
    }

    public void setRegister(boolean register) {
        isRegister = register;
    }

    abstract void showInfo();

    @Override
    public String toString() {
        return "Animal{" +
                "birthdayTime='" + birthdayTime + '\'' +
                ", isRegister=" + isRegister +
                '}';
    }
}
