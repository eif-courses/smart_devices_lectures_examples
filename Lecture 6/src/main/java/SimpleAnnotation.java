import java.lang.annotation.*;

@Inherited
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface SimpleAnnotation {
    String vardas() default "Marius";
    int [] tasks() default {10, 25, 90};
}
