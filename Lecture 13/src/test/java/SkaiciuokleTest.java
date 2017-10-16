import org.junit.Assert;
import org.junit.Test;

public class SkaiciuokleTest {

    @Test
    public void sudeti_jeiguSkaiciusYraIntegerTipo_grazintiDviejuSkaiciuSuma(){
        Assert.assertEquals(4, 2 + 2);
    }
    @Test
    public void sudeti_jeiguSkaiciusYraTeigiamas_grazintiDviejuSkaiciuSuma(){
        Assert.assertEquals(3, 3);
    }
    @Test public void test1(){
        Assert.assertEquals(10, 9 + 1);
    }
}
