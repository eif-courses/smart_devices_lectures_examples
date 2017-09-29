import javax.swing.*;

interface Spalva{
    void nuspalvoti(Gyvunas gyvunas);
}
class Gyvunas{
    String pav;
    public Gyvunas(String pav) {
        this.pav = pav;
    }
    public String getPav() {
        return pav;
    }

    void spalvok(Gyvunas gyvunas, Spalva spalva){
        spalva.nuspalvoti(gyvunas);
    }
}
class SpalvinameGyvuna implements Spalva{
    @Override
    public void nuspalvoti(Gyvunas gyvunas) {
        System.out.println(gyvunas.getPav()+": nuspalvintas");
    }
}

public class Main {
    public static void main(String[] args) {
        Gyvunas lape = new Gyvunas("Lape");
        Gyvunas vilkas = new Gyvunas("Vilkas");
        SpalvinameGyvuna spalvinam = new SpalvinameGyvuna();
        lape.spalvok(lape, spalvinam);
        vilkas.spalvok(vilkas, spalvinam);


        vilkas.spalvok(vilkas, (gyvunas)-> System.out.println(gyvunas.getPav()));
        Kitas kit = (pav)-> {
           // System.out.println(pav.charAt(5));
            return pav.substring(5);
        };
        System.out.println("rez: "+kit.pavadinimas("Laba diena"));


    }

    interface Kitas{
         String pavadinimas(String k);
    }
}
