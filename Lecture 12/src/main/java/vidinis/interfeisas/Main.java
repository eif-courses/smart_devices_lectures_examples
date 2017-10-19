package vidinis.interfeisas;

public class Main {
    public static void main(String[] args) {

        Auditorija auditorija = new Auditorija.Builder()
                .pavadinimas("Kompiuterine")
                .numeris("10")
                .sukurtiAuditorija();

        System.out.println(auditorija);

        Skaiciavimas skaiciavimas = () -> System.out.println(" hello");
        Skaiciavimas.Daugyba daugyba = (a, b)-> a * b;
        Skaiciavimas.Dalyba dalyba = (a, b)-> a / b;
        dalyba.dalinti(10, 20);

        int rezultatas = daugyba.dauginti(10, 20);
        System.out.println(rezultatas);
    }
}
class Auditorija{
    private String pav;
    private String nr;

    public Auditorija(String pav, String nr) {
        this.pav = pav;
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Auditorija{" +
                "pav='" + pav + '\'' +
                ", nr='" + nr + '\'' +
                '}';
    }

    public Auditorija() {
    }
    public static class Builder{
        private Auditorija auditorija = new Auditorija();

        public Builder pavadinimas(String pavadinimas){
            auditorija.pav = pavadinimas;
            return this;
        }
        public Builder numeris(String nr){
            auditorija.nr = nr;
            return this;
        }
        public Auditorija sukurtiAuditorija(){
            return auditorija;
        }



    }

}

class InterfeisuTestas implements Skaiciavimas, Skaiciavimas.Daugyba{

    @Override
    public void spausdinti() {

    }

    @Override
    public int dauginti(int a, int b) {
        return 0;
    }
}
