public abstract class Rodiklis extends Thread implements RodiklisInterface{
    private String pavadinimas, kodas, aprasymas;
    private int min, max;

    public Rodiklis(String pavadinimas, String kodas, String aprasymas, int min, int max) {
        this.pavadinimas = pavadinimas;
        this.kodas = kodas;
        this.aprasymas = aprasymas;
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Rodiklis{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", kodas='" + kodas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", min=" + min +
                ", max=" + max +
                '}';
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getKodas() {
        return kodas;
    }

    public void setKodas(String kodas) {
        this.kodas = kodas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
