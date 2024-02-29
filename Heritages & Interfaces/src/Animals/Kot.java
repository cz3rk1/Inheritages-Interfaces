package Animals;

class Kot extends Ssak{
    String rasa;
    public Kot(String gatunek, String rasa) {
        super(gatunek);
        this.rasa = rasa;
    }
    public void podajInformacjeOZwierzęciu() {
        System.out.println("Gatunek zwierzęcia: " + gatunek);
        System.out.println("Rasa psa: " + rasa);}
    public void głos() {
        System.out.println("Miau");
    }
}
