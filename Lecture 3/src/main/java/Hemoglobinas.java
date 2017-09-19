public class Hemoglobinas extends Rodiklis{
    public Hemoglobinas(String pavadinimas, String kodas, String aprasymas, int min, int max) {
        super(pavadinimas, kodas, aprasymas, min, max);
    }
    @Override
    public double skaiciavimas(Rodiklis r) {
        System.out.println("SKAICIUOJU: "+r.getPavadinimas());
        return 5 * 9;
    }
}
