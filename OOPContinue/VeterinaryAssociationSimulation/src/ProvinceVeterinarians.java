import java.util.ArrayList;

public class ProvinceVeterinarians {
    private String city;
    private ArrayList<Veterinarian> vetOfCity;
    private static int totalOfVeterinarian=0;
    private int vetsPerCity;

    public ProvinceVeterinarians(String city) {
        this.city = city;
        vetOfCity = new ArrayList<>();
        vetsPerCity = 0;
    }

    public void addAVetToCity(Veterinarian vet){
        vetOfCity.add(vet);
        totalOfVeterinarian++;
        vetsPerCity++;
    }

    public static int getTotalOfVeterinarian() {
        return totalOfVeterinarian;
    }

    public int getVetsPerCity() {
        return vetsPerCity;
    }
}
