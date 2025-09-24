public class InstanceOf {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof  Cat);


    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends  Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

