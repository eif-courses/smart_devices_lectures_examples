import judandytys_objektai.Automobilis;
import judandytys_objektai.Daiktas;
import judandytys_objektai.JudesysInterface;
import judandytys_objektai.Zmogus;
import judesio_isimtys.JudesysException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<JudesysInterface> judesio_objektai =
                new ArrayList<>();
        Automobilis opel = new Automobilis("Opel");
        Daiktas deze = new Daiktas("Deze");
        Zmogus vyras = new Zmogus("Vyras");

        judesio_objektai.add(opel);
        judesio_objektai.add(deze);
        judesio_objektai.add(vyras);
        judesio_objektai.add(new Zmogus("Petras"));
        // Runtime exception
       // vyras.getPavadinimas(1000);
        try {
            vyras.getPavadinimas("Vyras");
        } catch (JudesysException e) {
            //System.out.println("Jus ");
            System.out.println(e.getMessage());
        }
        for(JudesysInterface elem: judesio_objektai)
            elem.judeti();

    }
}
