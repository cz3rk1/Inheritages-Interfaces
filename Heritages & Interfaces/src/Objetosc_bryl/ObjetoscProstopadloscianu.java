package Objętość_brył;
class ObjetoscProstopadloscianu extends Zadanie {
    double dlugosc;
    double szerokosc;
    double wysokosc;
    double objetosc;
    public ObjetoscProstopadloscianu(double dlugosc, double szerokosc, double wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }
    void wprowadzDane() {
        System.out.println("Wprowadź wymiary prostopadłościanu:");
        System.out.println("Długość: " + dlugosc);
        System.out.println("Szerokość: " + szerokosc);
        System.out.println("Wysokość: " + wysokosc);
    }
    void wykonajObliczenia() {
        objetosc = dlugosc * szerokosc * wysokosc;
    }
    void wypiszWynik() {
        System.out.println("Objętość prostopadłościanu wynosi: " + Math.round(objetosc));
    }
}
