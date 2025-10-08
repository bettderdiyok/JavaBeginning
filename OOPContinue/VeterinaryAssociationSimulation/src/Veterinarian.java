import java.util.ArrayList;

public class Veterinarian extends Person{
    private String almaMater;
    private int yearOfWork;
    private ArrayList<Client> clients;
    private int numberOfClients;

    public Veterinarian(String id, String name, String almaMater, int yearOfWork) {
        super(id, name);
        this.almaMater = almaMater;
        this.yearOfWork = yearOfWork;
        clients = new ArrayList<>();
        numberOfClients = 0;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void addClient(Client client){
        clients.add(client);
        numberOfClients++;
    }

    public void listClients(){
        for (Client client : clients) {
            System.out.println(client);

        }
    }

    @Override
    void introduceOneself() {
        System.out.println(toString() + "I'm a vet");
    }

    @Override
    public String toString() {
        return super.toString() +"Veterinarian{" +
                "almaMater='" + almaMater + '\'' +
                ", yearOfWork=" + yearOfWork +
                '}';
    }
}
