import org.example.InverterPalavras;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void testar() {
        InverterPalavras inverter = new InverterPalavras();

        System.out.println(inverter.inverterPalavras("Olá mundo"));
        assertEquals("Olá odnum", inverter.inverterPalavras("Olá mundo"));

        System.out.println(inverter.inverterPalavras("Este é um teste"));
        assertEquals("Este é um etset", inverter.inverterPalavras("Este é um teste"));

        System.out.println(inverter.inverterPalavras("vamos praticar programacao"));
        assertEquals("somav racitarp oacamargorp", inverter.inverterPalavras("vamos praticar programacao"));

        System.out.println(inverter.inverterPalavras("Desafio de código"));
        assertEquals("oifaseD de ogidóc", inverter.inverterPalavras("Desafio de código"));

        System.out.println(inverter.inverterPalavras("Java é divertido"));
        assertEquals("Java é oditrevid", inverter.inverterPalavras("Java é divertido"));

        System.out.println(inverter.inverterPalavras("Aprender a programar é incrível"));
        assertEquals("rednerpA a ramargorp é levírcni", inverter.inverterPalavras("Aprender a programar é incrível"));
    }
}
