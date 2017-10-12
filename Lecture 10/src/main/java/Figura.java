



public abstract class Figura implements FiguraInterface {
    private String pavadinimas;

    public Figura() {
    }
    public Figura(FiguraInterface figuraInterface){
        System.out.println("Figuros perimetras:"+
                figuraInterface.perimetras());
    }

    public Figura(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    void info()
    {
        System.out.println("Tevines klases info");
    }
    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "pavadinimas='" + pavadinimas + '\'' +
                '}';
    }
}
