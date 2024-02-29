package Animals;
import java.util.Scanner;
public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rasę kota: ");
        String rasaKot = scanner.nextLine();

        System.out.print("Podaj rasę psa: ");
        String rasaPies = scanner.nextLine();

        Kot kot = new Kot("Kot", rasaKot);
        Pies pies = new Pies("Pies", rasaPies);

        System.out.println();
        kot.podajInformacjeOZwierzęciu();
        kot.głos();

        System.out.println();
        pies.podajInformacjeOZwierzęciu();
        pies.głos();
    }
}
