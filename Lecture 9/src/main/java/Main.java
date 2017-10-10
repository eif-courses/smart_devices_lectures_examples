import java.util.ArrayList;
import java.util.List;

public class Main {

    //public static void dalyba(int ...a){

    //}
    public static void dalyba(int a, int b){

    }
    public static void dalyba(float a, float b){

    }
    public static void dalyba(double a, double b){

    }
    public static <T extends Number, E extends Number>void dalyba(T t, E e){

    }
    public static <T extends Integer>void dalyba(T... t){

    }



    public static void main(String[] args) {

        //dalyba(50, 10, 20.0,20.0);
        dalyba(10, 20, 10, 10, 10, 10, 50);
        dalyba(10, 20);
      Paukstis<Kregzde, Float> paukstis =
              new Paukstis<>("");
      Paukstis p = new Paukstis("");
      //p.skristi();
     // paukstis.skristi();
        Integer mas[] = {10,20, 30, 14, 14};
        String masyvas[] = {"wea", "wae","ersres"};
        spausdinti(mas);
        spausdinti(masyvas);
        List<Gyvunas> gyvunai = new ArrayList<>();
        gyvunai.add(new Gyvunas("Lape"));
        gyvunai.add(new Gyvunas("Vilkas"));
        gyvunai.add(new Gyvunas("Kiskis"));
        p.ziemoti(gyvunai);
       // Paukstis<? extends Gyvunas,? super Gyvunas> wildCardPaukstis = new Paukstis();
        p.skristi(gyvunai, new Gyvunas(""));
    }


    public static <T> T[] spausdinti(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            T t = arr[i];
        }
        return arr;
    }
}
