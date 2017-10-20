import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Klase klase = new Klase("Pbject");

        List<String> list = new ArrayList<>(Collections.nCopies(50, "Laba diena"));

        List<Integer> integers = new ArrayList<>(Collections.nCopies(50, 99));
        for (Integer integer : integers) {
            //System.out.println(integer);
        }
        //sarasas(integers);

        Skaiciuoti skaiciuoti = (o, o2) -> System.out.println(o);
        Skaiciuoti.Dalyba  dalyba = (a, b) -> System.out.println(a + b);

        Predikatas<String> predikatas = (ee) -> ee.startsWith("L");

               long sk = list.stream().filter(predikatas).count();
              // Object o = list.stream().filter(e -> e.startsWith("L"));

        System.out.println(sk);



        String kk = (String) klase.getObject();
        System.out.println(skaiciuoti(10, 50.5));
        KlaseGenerics<String> klaseGenerics = new KlaseGenerics<>("");
        String s = klaseGenerics.getTipas();
    }
    public static <E extends Integer, K extends Double> double skaiciuoti(E e, K k){
        return e.intValue() + k.doubleValue();
    }
    public static List<? extends Number> sarasas(List<? extends Number> list){
        return list;
    }


}

interface Predikatas<T> extends Predicate<T>{
    boolean test(T t);
}

@FunctionalInterface
interface Skaiciuoti{
    void skaiciuoti(Object o, Object o2);
    interface Daugyba{
        void dauginti(int a, int b);
    }
    interface Dalyba{
        void dalinti(int a, int b);
    }

}

