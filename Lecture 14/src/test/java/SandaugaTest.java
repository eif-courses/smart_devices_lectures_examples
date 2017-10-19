import org.junit.Assert;
import org.junit.Test;

public class SandaugaTest {
    @Test
    public void createClass() throws Exception {
        Sandauga sandauga = new Sandauga();
    }
    @Test
    public void sudauginti_du_skaicius_rezultatas25() throws Exception {
        Sandauga sandauga = new Sandauga();
        Assert.assertEquals(25, sandauga.daugyba(5, 5));
    }

    @Test
    public void sudauginti_du_skaicius_rezultatas36() throws Exception {
        Sandauga sandauga = new Sandauga();
        Assert.assertEquals(36, sandauga.daugyba(6, 6));
    }
}
