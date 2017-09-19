public class Leukocitas extends Rodiklis{
    public Leukocitas(String pavadinimas, String kodas, String aprasymas, int min, int max) {
        super(pavadinimas, kodas, aprasymas, min, max);
    }

    @Override
    public double skaiciavimas(Rodiklis r) {
        System.out.println("As esu:"+ r.getPavadinimas());
        return 0;
    }
}
