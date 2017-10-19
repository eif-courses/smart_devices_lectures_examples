import judandytys_objektai.Automobilis;
import judandytys_objektai.Daiktas;
import judandytys_objektai.JudesysInterface;
import judandytys_objektai.Zmogus;
import judesio_isimtys.JudesysException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void kolegijos_judesys(Kolegija kolegija){
        kolegija.vaikscioti();
    }
    public static void main(String[] args) {

       // int a[] = {10, 20, 3};
        Universitetas vilniaus = new Universitetas("Vilniaus");
        Universitetas kauno = new Universitetas("Kauno");
        Universitetas [] universitetas = {
            vilniaus,
                kauno
        };
        Valstybe valstybe = new Valstybe("Lietuva", universitetas);
        valstybe.setU(vilniaus);
        System.out.println(valstybe);

        Valstybe kaunas = new Valstybe("Kauno", kauno);
        kaunas.setUniversitetas(universitetas);
        System.out.println(kaunas);


        for (int i = 0; i < universitetas.length; i++) {

            System.out.println(universitetas[i].pavadinimas);

        }





        kolegijos_judesys( ()-> System.out.println("Einame i kaire!!!!!!") );

        kolegijos_judesys(new Kolegija() {
            @Override
            public void vaikscioti() {
                System.out.println("Einame i desine !!!!");
            }
        });

        Predikatas<String> predicate = (kkk) -> kkk.startsWith("K");
       boolean rez= predicate.test("Kazys");
        System.out.println(rez);

       // Sumuoti sumuoti = (a, b) -> a * b;
     //   System.out.println(sumuoti.suma(50, 90));


        Kolegija lambda = () -> System.out.println("lAMBDA VEIKSMAS");
        lambda.vaikscioti();
//        List<JudesysInterface> judesio_objektai =
//                new ArrayList<>();
//        Automobilis opel = new Automobilis("Opel");
//        Daiktas deze = new Daiktas("Deze");
//        Zmogus vyras = new Zmogus("Vyras");
//
//        judesio_objektai.add(opel);
//        judesio_objektai.add(deze);
//        judesio_objektai.add(vyras);
//        judesio_objektai.add(new Zmogus("Petras"));
//        // Runtime exception
//       // vyras.getPavadinimas(1000);
//        try {
//            vyras.getPavadinimas("Vyrasf");
//        } catch (JudesysException e) {
//            //System.out.println("Jus ");
//            System.out.println(e.getMessage());
//        }
//        for(JudesysInterface elem: judesio_objektai)
//            elem.judeti();

        Kolegija kolegija = new Kolegija() {
            @Override
            public void vaikscioti() {
                System.out.println("Anonimine vaikstome");
            }
        };
        kolegija.vaikscioti();
    }



}
@FunctionalInterface
interface Kolegija{
    void vaikscioti();
    default void k(){}
    static void c(){}

}
class Universitetas implements Kolegija{
    public Universitetas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public String toString() {
        return "Universitetas{" +
                "pavadinimas='" + pavadinimas + '\'' +
                '}';
    }

    String pavadinimas;
    @Override
    public void vaikscioti() {
        System.out.println("vaikstom");
    }


}

interface Predikatas<T>{
    boolean test(T t);
}
interface Sumuoti{
    int suma(int a, int b);
}
class Valstybe {
    String pav;
    Universitetas [] universitetas;
    Universitetas u;
    public Valstybe(String pav, Universitetas[] universitetas) {
        this.pav = pav;
        this.universitetas = universitetas;
    }

    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }

    public Universitetas[] getUniversitetas() {
        return universitetas;
    }

    public void setUniversitetas(Universitetas[] universitetas) {
        this.universitetas = universitetas;
    }

    public Universitetas getU() {
        return u;
    }

    public void setU(Universitetas u) {
        this.u = u;
    }

    public Valstybe(String pav, Universitetas u) {
        this.pav = pav;
        this.u = u;
    }

    @Override
    public String toString() {
        return "Valstybe{" +
                "pav='" + pav + '\'' +
                ", universitetas=" + Arrays.toString(universitetas) +
                ", u=" + u +
                '}';
    }
}