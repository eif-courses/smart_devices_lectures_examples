import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Vector;
import java.util.function.Predicate;

@mano_anotacija
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Ok");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 400);
        jFrame.setLayout(new FlowLayout());




        ActionListener paspaudimas =  e -> System.out.println("Hello");

        jButton.addActionListener(paspaudimas);

        mygtuko_veiksmas(() -> System.out.println("veiksmas atliktas"),
                (p) -> p.getName().startsWith("J"), new Person("Jonas"));

        Comparator<Person> comparator = (o1, o2) -> o1.getAge()-o2.getAge();


//        Predikatas<Person> predikatas =
//                (petras) -> petras.getName().equals("PEtras");
//        System.out.println(predikatas.test(new Person("PEtras")));
        jFrame.add(jButton);

        Method [] methods = Person.class.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(mano_anotacija.class)){
                mano_anotacija ann = method.getAnnotation(mano_anotacija.class);
                System.out.println(ann.vardas() +" "+ method.getName());
            }
        }





       // jFrame.setVisible(true);


    }
    public static void mygtuko_veiksmas(Veiksmas v, Predikatas<Person>  predikatas, Person person){
        boolean t = predikatas.test(person);
        if(t){
            System.out.println("LYGUS");
        }else{
            System.out.println("NELYGUS");
        }
        v.spausdinti();
    }
}

interface Predikatas<TIPAS>{
    boolean test(TIPAS t);
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface mano_anotacija{
    String vardas() default "Petras";
    int [] masyvas() default {10, 20, 30, 40};
}


interface Veiksmas{
    void spausdinti();
}
@mano_anotacija(vardas = "Jonas", masyvas = {50, 90, 60})
class Person{
    String name;
    int age;
    public Person(String name) {
        this.name = name;
    }

    @mano_anotacija(vardas = "Jonas")
    public String getName() {
        return name;
    }

    @mano_anotacija
    public void setName(String name) {
        this.name = name;
    }

    @mano_anotacija(vardas = "Ona", masyvas = {50, 30, 60})
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}