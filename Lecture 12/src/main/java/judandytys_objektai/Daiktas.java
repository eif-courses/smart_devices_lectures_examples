package judandytys_objektai;

public class Daiktas implements JudesysInterface{
    private String pavadinimas;

    public Daiktas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public void judeti() {
        System.out.println("Krenta is penkto auksto.");
    }
}
