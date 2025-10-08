public class Main {
    public static void main(String[] args) {
        createFirstObjects();

    }

    private static void createFirstObjects(){
        Cat cat = new Cat("13.11.2000", true, "Scotish");
        System.out.println(cat);
        Cat cat2 = new Cat("24.11.2000", false, "Siamese" );
        Cat cat3 = new Cat("09.11.2000", true, "Van cat");
        Dog dog = new Dog("22.01.2019", true, 1);
        Dog dog2 = new Dog("30.10.2012", true, 4);
        Dog dog3 = new Dog("02.05.2003", false,3);
        Client client = new Client("123", "Emre", "Ankara");
        Client client2 = new Client("1234", "Betül", "İstanbul");
        Client client3 = new Client("12345", "Selim", "İstanbul");
        client3.addAnimals(cat);
        client3.addAnimals(dog3);
        System.out.println(client3);
        client3.introduceOneself();
        Veterinarian vet1 = new Veterinarian("456", "Ayse", "Hacettepe", 2);
        System.out.println(vet1);
        vet1.introduceOneself();
        vet1.addClient(client2);
        vet1.addClient(client3);
        Veterinarian vet2 = new Veterinarian("2345", "Hülya", "Cerrahpaşa", 4);
        System.out.println(vet1.getNumberOfClients());
        Veterinarian vet3 = new Veterinarian("45678", "Selami", "YTÜ", 10);
        vet1.listClients();
        ProvinceVeterinarians ankara = new ProvinceVeterinarians("Ankara");
        ankara.addAVetToCity(vet1);
        ProvinceVeterinarians istanbul = new ProvinceVeterinarians("İstanbul");
        istanbul.addAVetToCity(vet2);
        System.out.println(ProvinceVeterinarians.getTotalOfVeterinarian());
        istanbul.addAVetToCity(vet3);
        System.out.println(istanbul.getVetsPerCity());
        System.out.println(ankara.getVetsPerCity());
        ManagementPanel<Animal> animalManagementPanel = new ManagementPanel<>();
        animalManagementPanel.showInformation(cat2);
        animalManagementPanel.showInformation(dog3);

        ManagementPanel<Veterinarian> veterinarianManagementPanel = new ManagementPanel<>();
        veterinarianManagementPanel.showInformation(vet1);

    }
}
