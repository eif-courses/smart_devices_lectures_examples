package judandytys_objektai;

public class Automobilis implements JudesysInterface{
    private String pavadinimas;

    public Automobilis(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public void judeti() {
        System.out.println(pavadinimas+" greitai vaziuoja: ");
        for (int i = 0; i < 20; i++) {
            try {
                System.out.print("-");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
