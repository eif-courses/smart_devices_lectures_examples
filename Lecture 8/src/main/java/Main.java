import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        List<String> listGeneric = new ArrayList<>();
//        listGeneric.add("Labas");
//       // listGeneric.add(new Integer(10));
//        List list = new ArrayList();
//        list.add("waeaw");
//        list.add(45);
//        for (Object o : list) {
//            String s = (String)o;
//        }
        Namas<String> namas = new Namas<>();
        //Namas<Integer> namas2 = new Namas<>();
        ieskotiPagalPirmaRaide("L");
        ieskotiPagalPirmaRaide((e) -> e.toLowerCase().endsWith("s"));

    // namas.printList(sarasas);
        //namas2.printList(new ArrayList<>(List.of(10, 20, 30)));

    }
   public static void palyginti(String str, Predikatas<String> predikatas,
                                Konsiumeris<String> konsiumeris){
        if(predikatas.testuojam(str)){
            konsiumeris.priimuReiksme(str);
        }
   }
   public static void ieskotiPagalPirmaRaide(Predikatas<String> predikatas){
       List<String> sarasas =  new ArrayList<>(List.of(
               "Labas","Viso", "Krabas", "Mokykla", "Lapas", "Lape"
       ));

       for (String elem : sarasas) {
           palyginti(elem, predikatas, (k) -> System.out.println(k));
       }
   }
    public static void ieskotiPagalPirmaRaide(String raide){
        List<String> sarasas =  new ArrayList<>(List.of(
                "Labas","Viso", "Krabas", "Mokykla", "Lapas", "Lape"
        ));

        for (String elem : sarasas) {
            palyginti(elem, (e) -> e.startsWith(raide), (k) -> System.out.println(k));
        }
    }


}

interface Konsiumeris<T>{
    void priimuReiksme(T t);
}
interface Predikatas<T>{
    boolean testuojam(T t);
}













class Namas<TIPAS extends String> {
    private TIPAS tipas;

    void printNeGeneric(List l){

    }
    void printList(List<TIPAS> list){
        for (TIPAS elem : list) {
            System.out.println(elem);
        }
        //list.forEach((e)-> System.out.println(e));
        //list.forEach(System.out::println);
    }

    public TIPAS getTipas() {
        return tipas;
    }
    public void setTipas(TIPAS tipas) {
        this.tipas = tipas;
    }
}