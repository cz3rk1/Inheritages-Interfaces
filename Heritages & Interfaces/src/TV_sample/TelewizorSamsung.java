package TV_sample;

public class TelewizorSamsung extends Telewizor{
    int rokProdukcji;
    boolean czyTrybHDR;
    boolean czyNaRaty;

    TelewizorSamsung(int rokProdukcji, boolean czyTrybHDR, boolean czyNaRaty, String nazwaTelewizora, double przekatna, String rozdzielczosc, double cena, boolean czyRabat){
        super(nazwaTelewizora, przekatna, rozdzielczosc, cena, czyRabat);
        this.rokProdukcji = rokProdukcji;
        this.czyTrybHDR = czyTrybHDR;
        this.czyNaRaty = czyNaRaty;
    }
    TelewizorSamsung(int rokProdukcji, boolean czyTrybHDR, boolean czyNaRaty, String nazwaTelewizora, double przekatna, String rozdzielczosc, double cena) {
        this(rokProdukcji, czyTrybHDR, czyNaRaty, nazwaTelewizora, przekatna, rozdzielczosc, cena, false);
    }
    void wyswietlInformacje() {
        System.out.println("Telewizor Samsung o nazwie: " + nazwaTelewizora + ", Cena: " + cena + " PLN, Przekątna: " + przekatna + " cali, Rozdzielczość: " + rozdzielczosc +
                ", Rok produkcji: " + rokProdukcji + ", Tryb HDR: " + czyTrybHDR + ", Czy na raty: " + czyNaRaty);
    }
    void obliczRabat() { if(czyRabat) cena *= 0.90; }
    double obliczRate() {return cena / 12;}
    double obliczRate(int liczbaMiesiecy) { return cena / liczbaMiesiecy; }
}
