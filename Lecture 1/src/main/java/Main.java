import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Main {
    public Main(int konstanta){
        KONSTANTA = konstanta;
        System.out.println("As esu konstruktorius");
    }
    static{
        PI = 3.14;
        System.out.println("As esu statinis blokas ");
    }

    private static final double PI;
    private final int KONSTANTA;

    public int getKONSTANTA() {
        return KONSTANTA;
    }

    public static void main(String[] args) {

        //Main m = new Main(5);
       // new Main(9);
       // new Main(10);
      //  System.out.println(P);
        //System.out.println(""+PI);
        Lape lape = new Lape("ruda", 58);
        lape.setGyvenimo_trukme(98);
        Lape.setPavadinimas();
        Gyvunas.setPavadinimas();
        Kompiuteris kompiuteris = new Kompiuteris();
        Kompiuteris.RAM atmintis = kompiuteris.new RAM();
        JButton mygtukas = new JButton("OK");


        mygtukas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }

}
