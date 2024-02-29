package Orchestra;

import java.util.ArrayList;

public class Opera {
    public static void main(String[] args) {
        ///utwórz obiekty i uruchom na nich dostępne metody

        ArrayList<Instrument> instrumenty = new ArrayList<>();
        instrumenty.add(new Guitar());
        instrumenty.add(new Trombone());
        instrumenty.add(new Flute());
        instrumenty.add(new GuitarElectric());

        for (Instrument i : instrumenty) {
            i.play();
            if (i instanceof Guitar) {
                ((Guitar) i).wycisz();
            }
        }
    }
}
