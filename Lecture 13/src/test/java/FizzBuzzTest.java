import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.TestMethod;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void canEvaluate(){
        fizzBuzz.evaluate(1);
    }

    @Test
    public void oneReturnsOne() throws Exception {
        Assert.assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() throws Exception {
        Assert.assertEquals("2", fizzBuzz.evaluate(2));
    }

    @Test
    public void threeeReturnsFizz() throws Exception {
        Assert.assertEquals("Fizz", fizzBuzz.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz() throws Exception {
        Assert.assertEquals("Buzz", fizzBuzz.evaluate(5));
    }

    @Test
    public void sixReturnsFizz() throws Exception {
        Assert.assertEquals("Fizz", fizzBuzz.evaluate(6));
    }

    @Test
    public void tenReturnsBuzz() throws Exception {
        Assert.assertEquals("Buzz", fizzBuzz.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz() throws Exception {
        Assert.assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }
    @Test
    public void thrityReturnsFizzBuzz() throws Exception {
        Assert.assertEquals("FizzBuzz", fizzBuzz.evaluate(30));
    }
}
