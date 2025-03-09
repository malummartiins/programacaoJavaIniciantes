import org.example.Troll;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    @Test
    public void TestesFixos() {
        assertEquals("st st é pr prddrs LL!" ,
                Troll.removerVogais("Este site é para perdedores LOL!"));
        assertEquals("Sm fnss, ms s scrt stá ntr s prs q  já l",
                Troll.removerVogais
                        ("Sem ofensas, mas sua escrita está entre as piores que eu já li"));
        assertEquals(" q vc , m dd?" , Troll.removerVogais("O que voce e, um doido?"));
    }

    public static String gerarCaracteresAleatorios(String caracteresPossiveis, int comprimento) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < comprimento; i++) {
            sb.append(caracteresPossiveis.charAt(random.nextInt(caracteresPossiveis.length())));
        }
        return sb.toString();
    }

    public static String C(String Z) {
        return Z.replaceAll("(?i)[aeiou]", "");
    }
}
