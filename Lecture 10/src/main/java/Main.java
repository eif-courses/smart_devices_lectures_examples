

public class Main {


    public static void main(String[] args) {
        Piramide piramide =
                new Piramide("Piramide");
        //System.out.println(piramide.perimetras());
        //piramide.getPavadinimas();
        System.out.println(piramide);
        System.out.println(new Piramide(50, 50));
        TrikampisPagalbine t = new TrikampisPagalbine();
       // t.plotas();
        t.info();
        Figura s = new Staciakampis(new Apskritimas());
        Figura kk = new TrikampisPagalbine();
        Thread d = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        s.perimetras();
        //piramide.info();
    }




}
