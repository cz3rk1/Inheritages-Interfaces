package Uczelnia;

public class ObslugaStudenta {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski",
                                    12345, "Informatyka", 4.07);
        Student student2 = new Student("Anna", "Nowak",
                                    54321, "Matematyka", 4.7);

        student1.wyświetlDane();
        System.out.println("Wiek : " + student1.podajWiekUzytkownika());
        student1.czyDostanieStypendium();

        System.out.println();

        student2.wyświetlDane();
        System.out.println("Wiek : " + student2.podajWiekUzytkownika());
        student2.czyDostanieStypendium();
    }
}
