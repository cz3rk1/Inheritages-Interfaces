package Uczelnia;
public class Student extends Uzytkownik {
    int numerAlbumu;
    String kierunek;
    double sredniaOcen;
    public Student(String imie, String nazwisko, int numerAlbumu, String kierunek, double sredniaOcen){
        super(imie, nazwisko);
        this.numerAlbumu = numerAlbumu;
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }
    public void czyDostanieStypendium() {
        if (sredniaOcen >= 4.1) {
            System.out.println("Student otrzyma stypendium!");
        } else {
            System.out.println("Student nie otrzyma stypendium.");
        }
    }
    @Override
    public void wyświetlDane() {
        super.wyświetlDane();
        System.out.println("Numer albumu: " + numerAlbumu);
        System.out.println("Kierunek: " + kierunek);
        System.out.println("Średnia ocen: " + sredniaOcen);
    }
}
