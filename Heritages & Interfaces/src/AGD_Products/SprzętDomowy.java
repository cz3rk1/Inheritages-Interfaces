package AGD_Products;

public class SprzętDomowy {
    public static void main(String[] args) {
        Lodowka lodowka = new Lodowka("Samsung");
        Pralka pralka = new Pralka("Whirlpool");

        lodowka.podajInformacjeOSprzecie();
        lodowka.uruchom();
        lodowka.zatrzymaj();

        System.out.println();

        pralka.podajInformacjeOSprzecie();
        pralka.uruchom();
        pralka.zatrzymaj();
    }
}
