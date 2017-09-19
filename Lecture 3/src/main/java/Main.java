import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rodiklis leu = new Leukocitas("Hemoglobinas", "HMG", "Kraujo tirstumo rodiklis", 100, 165);
        Rodiklis rodAbstraktus = new Leukocitas("Hemoglobinas", "HMG", "Kraujo tirstumo rodiklis", 100, 165);

         Rodiklis hmg = new Hemoglobinas("Hemoglobinas",
                "HMG", "Kraujo tirstumo rodiklis",
               100, 165);
         hmg.skaiciavimas(hmg);
         leu.skaiciavimas(leu);
        List<Rodiklis> rodikliai = new ArrayList<>();
        rodikliai.add(leu);
        rodikliai.add(hmg);
        rodikliai.add(leu);
        rodikliai.add(hmg);
        List<Integer> rez = new ArrayList<>();
        for (Rodiklis elem: rodikliai) {
            if(elem.getMin() < 30 ){
                rez.add(new Integer(0));
            }
            else if(elem.getMax() < 90){
                rez.add(new Integer(1));
            }
            else{
                rez.add(new Integer(2));
            }
                System.out.println(elem);
        }
        for (Integer i: rez) {
            System.out.print(" "+i);
        }




    }
}
