import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlarmeTest {

    @Test
    public void setAlarmeTest() {
        assertTrue("Should be true.", Alarme.definirAlarme(true, false));
        assertFalse("Should be false.", Alarme.definirAlarme(true, true));
        assertFalse("Should be false.", Alarme.definirAlarme(false, false));
        assertFalse("Should be false.", Alarme.definirAlarme(false, true));
    }
}
