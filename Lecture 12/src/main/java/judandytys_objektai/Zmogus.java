package judandytys_objektai;

import judesio_isimtys.JudesysException;
import judesio_isimtys.JudesysRuntimeException;

public class Zmogus implements JudesysInterface{
    private String pav;
    public Zmogus(String pavadinimas) {
        pav = pavadinimas;
        //System.out.println("Zmogus sukurtas:"+pavadinimas);
    }
    @Override
    public void judeti() {
        System.out.println(pav+" letai eina namo: ");
        for (int i = 0; i < 20; i++) {
            try {
                System.out.print("-");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //System.out.println(pav +" letai eina namo.");
    }
    public void getPavadinimas(String pavadinimas) throws JudesysException {
        if(pavadinimas.equals("Vyras")){
            throw new JudesysException("Vyras netinkamas pavadinimas");
        }
    }
    public void getPavadinimas(int id) {
        if(id == 1000){
            throw new JudesysRuntimeException("JUSU ID YRA NETINKAMAS TURI BUTI MAZESNIS NEI 1000!");
        }
    }
}
