import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrdemDecrescenteTest {
    @Test
    public void test_01() {
        assertEquals(0, OrdemDecrescente.ordenarDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(1, OrdemDecrescente.ordenarDesc(1));
    }

    @Test
    public void test_03() {
        assertEquals(51, OrdemDecrescente.ordenarDesc(15));
    }

    @Test
    public void test_04() {
        assertEquals(2110, OrdemDecrescente.ordenarDesc(1021));
    }

    @Test
    public void test_05() {
        assertEquals(987654321, OrdemDecrescente.ordenarDesc(123495678));
    }

}
