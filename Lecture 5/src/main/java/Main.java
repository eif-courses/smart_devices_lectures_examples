import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        Auditorija<Kompiuterine> auditorija = new Auditorija<>();
        Auditorija<Amfiteatrine> auditorija2 = new Auditorija<>();
        //Nerekomenduojama
        Auditorija au = new Auditorija();


        auditorija.setTipas(new Kompiuterine());
        auditorija2.setTipas(new Amfiteatrine());
        auditorija.getTipas();
        auditorija2.getTipas();
        List<Kompiuterine> list2 = new ArrayList<>();
        list2.add(new Kompiuterine());
        list2.add(new Kompiuterine());

        auditorija.spausdinti(list2);

        List<String> list = new ArrayList<>();
        list.add("Labas");
        //list.add(new Integer(50));
        for (Object o: list) {
            String s = (String)o;
        }
    }
}
