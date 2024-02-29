package Animals;

class Ssak implements Zwierzę{
    String gatunek;
    Ssak(String gatunek){
        this.gatunek = gatunek;
    }
    public void podajInformacjeOZwierzęciu() { System.out.println("Gatunek zwierzęcia: " + gatunek);}
}
