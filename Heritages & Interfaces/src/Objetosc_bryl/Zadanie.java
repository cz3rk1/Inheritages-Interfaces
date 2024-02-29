package Objętość_brył;
abstract class Zadanie {
    abstract void wprowadzDane();
    abstract void wykonajObliczenia();
    abstract void wypiszWynik();
    void rozwiąż() {
        wprowadzDane();
        wykonajObliczenia();
        wypiszWynik();
    }
}