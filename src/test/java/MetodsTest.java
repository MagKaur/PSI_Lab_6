import org.junit.*;

public class MetodsTest {
    @Test
    public void testMinimum()
    {
        Metods metods = new Metods();
        Assert.assertEquals(metods.minimum(3,9), 3);
    }

    @Test
    public void testMaximum()
    {
        Metods metods = new Metods();
        Assert.assertEquals(metods.maximum(75, -8), 75);
    }

    @Test
    public void testIsPositiveTrue()
    {
        Metods metods = new Metods();
        Assert.assertEquals(metods.isPositive(99), true);
    }

    @Test
    public void testIsPositiveFalse()
    {
        Metods metods = new Metods();
        Assert.assertEquals(metods.isPositive(-23), false);
    }
}
