import java.util.ArrayList;

public class Client extends Person{
    private String adress;
    private ArrayList<Animal> animalsOfClient;
    private int numberAnimalsOfClient = 0;

    public Client(String id, String name, String adress) {
        super(id, name);
        this.adress = adress;
        animalsOfClient = new ArrayList<>();
    }
    public void addAnimals(Animal animal){
        animalsOfClient.add(animal);
        ++numberAnimalsOfClient;

    }



    @Override
    void introduceOneself() {
        System.out.println(toString() + "\nI'm a client");
    }

    @Override
    public String toString() {
        return  super.toString() + "Client{" +
                "adress='" + adress + '\'' +
                '}' + "\nThe number of animals owned by the client : " +  numberAnimalsOfClient;
    }
}
