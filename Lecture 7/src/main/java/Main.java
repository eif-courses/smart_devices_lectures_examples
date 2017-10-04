import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.*;

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
    void randomGyvunas(){
        System.out.println("RANDOM GYVUNAS");
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

class Procesas extends Thread{
    @Override
    public void run() {
        System.out.println("Pagrindinis procesas");
    }
}

class KitasProcesas extends Gyvunas implements Runnable, Spalva{
    public KitasProcesas(String pav) {
        super(pav);
    }
    @Override
    public void run() {
        System.out.println("Kitas procesas.");
    }
    @Override
    public void nuspalvoti(Gyvunas gyvunas) {

    }
}
public class Main {

    public static void spausdintiGyvunusPagalPirmaRaide(List<Gyvunas> list,
                                                        Predicate<Gyvunas> predicate, java.util.function.Consumer<Gyvunas> consumer){
        for (Gyvunas gyvunas : list) {
            if(predicate.test(gyvunas)){
                consumer.accept(gyvunas);
                // sout
            }
        }
    }

    public static void main(String[] args) {



        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonimine procesas paleistas");
            }
        };
        Runnable kitas = () -> System.out.println("Lambda procesas paleistas");

        new Thread(runnable).start();
        new Thread(kitas).start();
        new Procesas().start();
        new Thread(new KitasProcesas("Kitas")).start();

        JFrame jFrame = new JFrame();
        JButton j = new JButton("OK");
        j.addActionListener(e -> JOptionPane.showMessageDialog(null, "Mygtukas paspaustas"));
        jFrame.add(j);
        jFrame.pack();
        jFrame.setVisible(true);

        List<Gyvunas> gyvunai = new ArrayList<>();
        Gyvunas lape = new Gyvunas("Lape");
        Gyvunas vilkas = new Gyvunas("Vilkas");
        gyvunai.add(lape);
        gyvunai.add(vilkas);
        gyvunai.add(lape);
        gyvunai.add(vilkas);
        gyvunai.add(lape);
        gyvunai.add(vilkas);

       Consumer<Gyvunas> gyvunasConsumer = System.out::println;
       Predicate<Gyvunas> predicate = gyvunas -> gyvunas.getPav().startsWith("l");
       Consumer<Gyvunas> lapesCons = Gyvunas::randomGyvunas;
       lapesCons.accept(lape);
       String s [] = {"wea", "wae"};
        Arrays.sort(s, String::compareTo);
       // Comparator
       // int isorinis = 50;
       BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a / b );


       biConsumer.accept(1,0);

       //gyvunasConsumer.accept(lape);

        spausdintiGyvunusPagalPirmaRaide(gyvunai, predicate, gyvunasConsumer);



        SpalvinameGyvuna spalvinam = new SpalvinameGyvuna();
        lape.spalvok(lape, spalvinam);
        vilkas.spalvok(vilkas, spalvinam);
        vilkas.spalvok(vilkas, (gyvunas)-> System.out.println(gyvunas.getPav()));
        Kitas kit = (pav)-> {
           // System.out.println(pav.charAt(5));
            return pav.substring(5);
        };
        System.out.println("rez: "+kit.pavadinimas("Laba diena"));
        LambdaInterfeisas la = (a, b) -> a + (int)2.5;
        Runnable r = () -> System.out.println("aweaew");
        new Thread(r).start();
    }
    interface Kitas{
         String pavadinimas(String k);
    }
    @FunctionalInterface
    interface LambdaInterfeisas{
        int skaiciuoti(int a, int b);
        default void sk(){
            System.out.println("Helllo");
        }
        static void sudeti(int a, int b){
            System.out.println(a+b);
        }
       // void kitas();
    }
    interface GyvunasI{
        Gyvunas gyv();
    }




}
