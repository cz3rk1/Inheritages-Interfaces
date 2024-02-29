package AGD_Products;

public class Pralka implements SprzętAGD{
    String marka;

    public Pralka(String marka) {
        this.marka = marka;
    }
    public void podajInformacjeOSprzecie() {
        System.out.println("Pralka marki: " + marka);
    }
    public void uruchom() {
        System.out.println("Rozpoczynam pranie");
    }
    public void zatrzymaj() {
        System.out.println("Pranie zakończone");
    }
}
