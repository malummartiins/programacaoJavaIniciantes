import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SemaforoTest {
    String entrada;
    String esperado;

    @Test
    public void testAtualizarSemaforo() {
        assertEquals("verde", Semaforo.atualizarSemaforo("vermelho"));
        assertEquals("amarelo", Semaforo.atualizarSemaforo("verde"));
        assertEquals("vermelho", Semaforo.atualizarSemaforo("amarelo"));
    }

    @Test
    public void testAtualizacaoAleatoriaSemaforo() {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int indice = rand.nextInt(3);
            switch (indice) {
                case 0:
                    entrada = "verde";
                    esperado = "amarelo";
                    break;
                case 1:
                    entrada = "amarelo";
                    esperado = "vermelho";
                    break;
                case 2:
                    entrada = "vermelho";
                    esperado = "verde";
                    break;
            }
            assertEquals(esperado, Semaforo.atualizarSemaforo(entrada));
        }
    }

}
