import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SaudacaoTest {

    @Test
    public void testesBasicos() {
        assertEquals("Para as entradas \"Daniel\" e \"Daniel\"", "Olá chefe", Saudacao.cumprimentar("Daniel", "Daniel"));
        assertEquals("Para as entradas \"Greg\" e \"Daniel\"", "Olá convidado", Saudacao.cumprimentar("Greg", "Daniel"));
    }

    private static final String[] nomes =
            {"João", "George", "Michael", "Nick", "Tony", "Ben", "Maria", "Helen", "Jen", "Lucy", "Eva"};

    @Test
    public void testesAleatorios() {
        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            int a = aleatorio.nextInt(nomes.length);
            assertEquals("Para as entradas \"" + nomes[a] + "\" e \"" + nomes[a] + "\"",
                    "Olá chefe",
                    Saudacao.cumprimentar(new String(nomes[a]), new String(nomes[a])));
        }
        for (int i = 0; i < 10; i++) {
            int a = aleatorio.nextInt(nomes.length / 2);
            int b = aleatorio.nextInt(nomes.length / 2) + nomes.length / 2;
            assertEquals("Para as entradas \"" + nomes[a] + "\" e \"" + nomes[b] + "\"",
                    "Olá convidado",
                    Saudacao.cumprimentar(new String(nomes[a]), new String(nomes[b])));
        }
    }
}
