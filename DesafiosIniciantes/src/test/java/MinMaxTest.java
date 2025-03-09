import org.example.MinMax;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinMaxTest {

    private MinMax minMax = new MinMax();

    @Test
    public void fixedMin()
    {
        assertEquals(-110, minMax.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, minMax.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(1, minMax.min(new int[]{1, 2, 3, 4, 5, 10}));
        assertEquals(-10, minMax.min(new int[]{-1, -2, -3, -4, -5, -10}));
    }

    @Test
    public void fixedMax()
    {
        assertEquals(56, minMax.max(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(566, minMax.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, minMax.max(new int[]{5}));
        assertEquals(555, minMax.max(new int[]{534,43,2,1,3,4,5,5,443,443,555,555}));
    }
}
