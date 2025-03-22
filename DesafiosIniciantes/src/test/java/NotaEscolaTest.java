import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;


public class NotaEscolaTest {
    private static void executarTeste(int a, int b, int c, char esperado) {
        char atual = NotaEscola.obterNota(a, b, c);
        assertEquals(esperado, atual);
    }

    @Test
    public void testarA() {
        executarTeste(95, 90, 93, 'A');
        executarTeste(100, 85, 96, 'A');
        executarTeste(92, 93, 94, 'A');
        executarTeste(100, 100, 100, 'A');
    }

    @Test
    public void testarB() {
        executarTeste(70, 70, 100, 'B');
        executarTeste(82, 85, 87, 'B');
        executarTeste(84, 79, 85, 'B');
    }

    @Test
    public void testarC() {
        executarTeste(70, 70, 70, 'C');
        executarTeste(75, 70, 79, 'C');
        executarTeste(60, 82, 76, 'C');
    }

    @Test
    public void testarD() {
        executarTeste(65, 70, 59, 'D');
        executarTeste(66, 62, 68, 'D');
        executarTeste(58, 62, 70, 'D');
    }

    @Test
    public void testarF() {
        executarTeste(44, 55, 52, 'F');
        executarTeste(48, 55, 52, 'F');
        executarTeste(58, 59, 60, 'F');
        executarTeste(0, 0, 0, 'F');
    }

    @Test
    public void testesAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < 100; ++i) {
            int a = rand.nextInt(101);
            int b = rand.nextInt(101);
            int c = rand.nextInt(101);
            executarTeste(a, b, c, solucao(a, b, c));
        }
    }

    private static char solucao(int n1, int n2, int n3) {
        int media = (n1 + n2 + n3) / 3;
        if (media >= 90) return 'A';
        if (media >= 80) return 'B';
        if (media >= 70) return 'C';
        if (media >= 60) return 'D';
        return 'F';
    }
}
