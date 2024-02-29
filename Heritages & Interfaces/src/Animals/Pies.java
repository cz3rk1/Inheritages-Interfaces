package Animals;

class Pies extends Ssak{
String rasa;
    public Pies(String gatunek, String rasa) {
        super(gatunek);
        this.rasa = rasa;
    }
    public void podajInformacjeOZwierzęciu() {
        System.out.println("Gatunek zwierzęcia: " + gatunek);
        System.out.println("Rasa psa: " + rasa);}
    public void głos() {
        System.out.println("Hau Hau");
    }
}
