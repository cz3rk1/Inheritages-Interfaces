package TV_sample;

public class Main {
    public static void main(String[] args) {

        Telewizor telewizor = new Telewizor("ABC123", 45, "4K", 3999, false);


        TelewizorSamsung telewizorSamsung = new TelewizorSamsung(2023, true, true, "321CBA", 50, "8K", 5000, true);


        telewizor.obliczRabat();
        telewizor.wyswietlInformacje();

        double rata = telewizor.obliczRate();
        System.out.println("Rata: " + rata + " PLN");

        telewizorSamsung.obliczRabat();
        telewizorSamsung.wyswietlInformacje();

        double rataTelewizorSamsung = telewizorSamsung.obliczRate(24);
        System.out.println("Rata: " + rataTelewizorSamsung + " PLN");
    }
}
