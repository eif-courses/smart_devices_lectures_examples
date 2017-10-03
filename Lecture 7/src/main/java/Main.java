import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        LambdaInterfeisas la = (a, b) -> a + (int)2.5;
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


}
