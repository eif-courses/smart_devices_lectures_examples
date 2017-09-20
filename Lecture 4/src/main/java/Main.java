import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, NelegaliVeiklaRuntimeException {
        Integer mas[] = {18,89,48,4,441};
        List<Integer> skaiciai = new ArrayList<>();
        skaiciai.addAll(Arrays.asList(mas));
        skaiciai.forEach(System.out::print);
        Comparator<Integer> sk = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        };

        Thread.sleep(100);
        Collections.sort(skaiciai, sk);
        skaiciai.sort(sk);
        System.out.println(" ");
        skaiciai.forEach((i)-> System.err.print(i));
        System.out.println(" ");
        // Runtime - nereikia dėti į try bloką :)
        Person.nelegaliVeikla(new Integer(52));

        for (int i = 0; i < 6; i++) {
            try{
                Person.arSkaiciusNeperdidelis(skaiciai.get(i));
                skaiciai.get(i);
            }
            catch(TikMaziSkaiciaiException | ArrayIndexOutOfBoundsException ee){
              ee.printStackTrace();
               // System.out.println("Jusu klaida sugauta");
            }
            catch (Exception e){

            }

        }
    }
}
