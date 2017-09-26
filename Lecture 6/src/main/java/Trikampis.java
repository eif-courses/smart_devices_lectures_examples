import java.lang.reflect.Method;

public class Trikampis extends Figura{
    @SimpleAnnotation(vardas="Jonas", tasks = {98, 28, 92}) int qa;


    @SimpleAnnotation(vardas="Petras")
    private void kkk(){
        // System.out.println("hygkj");
    }
    @SimpleAnnotation(vardas="Jonas")
    @Override
    public void skaiciuoti_plota(){
        System.out.println("Cia vaikine klase");
        super.skaiciuoti_plota();
        kkk();
        Method[] methods = Trikampis.class.getMethods();
        for (Method method : methods) {
           // System.out.println(method);
            if(method.isAnnotationPresent(SimpleAnnotation.class)){
                SimpleAnnotation simple = method.getAnnotation(SimpleAnnotation.class);
                System.out.println("Vardas: "+simple.vardas());
            }

        }
    }

}
