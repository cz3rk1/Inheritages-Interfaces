package Objętość_brył;

public class ObjetoscBryl {
    public static void main(String[] args) {
        ObjetoscProstopadloscianu prostopadloscian = new ObjetoscProstopadloscianu(5, 3, 7);
        ObjetoscWalca walec = new ObjetoscWalca(4, 7);

        prostopadloscian.rozwiąż();

        System.out.println();

        walec.rozwiąż();
    }
}
