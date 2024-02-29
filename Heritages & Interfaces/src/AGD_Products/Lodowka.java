package AGD_Products;

public class Lodowka implements SprzętAGD {
    String marka;

    Lodowka(String marka) {
        this.marka = marka;
    }
    public void podajInformacjeOSprzecie() {
        System.out.println("Lodówka marki: " + marka);
    }
    public void uruchom() {
        System.out.println("Zaczynam chłodzić");
    }
    public void zatrzymaj() {
        System.out.println("Chłodzenie zatrzymane");
    }
}
