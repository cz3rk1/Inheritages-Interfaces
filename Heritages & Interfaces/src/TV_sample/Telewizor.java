package TV_sample;

public class Telewizor extends Towar{

    String nazwaTelewizora;
    double przekatna;
    String rozdzielczosc;

    Telewizor(String nazwaTelewizora, double przekatna, String rozdzielczosc, double cena, boolean czyRabat){
        this.nazwaTelewizora = nazwaTelewizora;
        this.przekatna = przekatna;
        this.rozdzielczosc = rozdzielczosc;
        this.cena = cena;
        this.czyRabat = czyRabat;
    }
    void wyswietlInformacje() {
        System.out.println("Telewizor o nazwie: " + nazwaTelewizora + ", Cena: " + cena + " PLN, Przekątna: " + przekatna + " cali, Rozdzielczość: " + rozdzielczosc);
    }
    void obliczRabat() { if(czyRabat) cena *= 0.95; }

    double obliczRate() {return cena / 12;}
}
