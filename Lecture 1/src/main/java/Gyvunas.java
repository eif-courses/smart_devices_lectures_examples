final class Parkas{}
public class Gyvunas {
    private  String pavadinimas;
    private  int gyvenimo_trukme;

    public Gyvunas(String pavadinimas, int gyvenimo_trukme) {
        this.pavadinimas = pavadinimas;
        this.gyvenimo_trukme = gyvenimo_trukme;
    }
    public final void setGyvenimo_trukme(int trukme){
        System.out.println("KEICIAM REIKSME");
    }
    public static void setPavadinimas(){
        System.out.println("PAVADINIMAS GYVUNAS");
    }

    @Override
    public String toString() {
        return "Gyvunas{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", gyvenimo_trukme=" + gyvenimo_trukme +
                '}';
    }
}
