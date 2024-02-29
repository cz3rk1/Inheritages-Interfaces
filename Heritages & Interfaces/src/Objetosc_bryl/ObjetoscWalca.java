package Objętość_brył;
class ObjetoscWalca extends Zadanie{
    double promien;
    double wysokosc;
    double objetosc;
    public ObjetoscWalca(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }
    void wprowadzDane() {
        System.out.println("Wprowadź wymiary walca:" );
        System.out.println("Promień: " + promien);
        System.out.println("Wysokość: " + wysokosc);
    }
    void wykonajObliczenia() {
        objetosc = Math.PI * Math.pow(promien, 2) * wysokosc;
    }
    void wypiszWynik() {
        System.out.println("Objętość walca wynosi: " + Math.round(objetosc));
    }
}