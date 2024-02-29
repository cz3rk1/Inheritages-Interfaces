package Uczelnia;
import java.util.Scanner;
public class Uzytkownik {
    String imie;
    String nazwisko;
    public Uzytkownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void wyświetlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
    public int podajWiekUzytkownika() {
        System.out.print("Podaj wiek : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
