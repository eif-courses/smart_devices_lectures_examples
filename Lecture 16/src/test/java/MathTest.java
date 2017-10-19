import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    private MathCustom math;

    @Before
    public void setUp() throws Exception {
        math = new MathCustom();
    }

    @Test
    public void add_sudetiDuSkaiciusIrGautiJuSuma4() throws Exception {
        Assert.assertEquals(4, math.add(2, 2));
    }
    @Test
    public void add_sudetiDuSkaiciusIrGautiJuSuma8() throws Exception {
        Assert.assertEquals(8, math.add(4, 4));
    }

}
