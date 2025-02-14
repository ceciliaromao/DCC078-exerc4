package visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XMLVisitorTest {
    @Test
    void deveExibirAdministrativo() {
        Administrativo administrativo = new Administrativo(123, "Joao Silva", 3589.97);
        XMLVisitor visitor = new XMLVisitor();

        String esperado = "<Administrativo>\n" +
                "\t<id>123</id>\n" +
                "\t<nome>Joao Silva</nome>\n" +
                "\t<salarioBase>3589.97</salarioBase>\n" +
                "</Administrativo>";

        assertEquals(esperado, visitor.exibir(administrativo));
    }

    @Test
    void deveExibirAdvogado() {
        Advogado advogado = new Advogado("MG123", "Joao Silva", 20);
        XMLVisitor visitor = new XMLVisitor();

        String esperado = "<Advogado>\n" +
                "\t<registroOAB>MG123</registroOAB>\n" +
                "\t<nome>Joao Silva</nome>\n" +
                "\t<numCasos>20</numCasos>\n" +
                "</Advogado>";

        assertEquals(esperado, visitor.exibir(advogado));
    }

    @Test
    void deveExibirCliente() {
        Contrato contrato = new Contrato(123, "Contrato Pessoa Fisica");
        Cliente cliente = new Cliente("12345678901", "Joao Silva", contrato);
        XMLVisitor visitor = new XMLVisitor();

        String esperado = "<Cliente>\n" +
                "\t<cpf>12345678901</cpf>\n" +
                "\t<nome>Joao Silva</nome>\n" +
                "\t<contrato>Contrato Pessoa Fisica</contrato>\n" +
                "\t<numeroContrato>123</numeroContrato>\n" +
                "</Cliente>";
        assertEquals(esperado, visitor.exibir(cliente));
    }

    @Test
    void deveExibirSocio() {
        Advogado advogado1 = new Advogado("MG123", "Joao Silva", 20);
        Advogado advogado2 = new Advogado("RJ456", "Maria Santos", 15);
        Advogado[] advogados = {advogado1, advogado2};
        Time time = new Time(advogados);
        Socio socio = new Socio("PA789", "Jose Oliveira", time);
        XMLVisitor visitor = new XMLVisitor();

        String esperado  = "<Socio>\n" +
                "\t<registroOAB>PA789</registroOAB>\n" +
                "\t<nome>Jose Oliveira</nome>\n" +
                "\t<time>\n" +
                "\t\t<Advogados>\n" +
                "\t\t\t<Advogado>\n" +
                "\t\t\t\t<RegistroOAB>MG123</RegistroOAB>\n" +
                "\t\t\t\t<Nome>Joao Silva</Nome>\n" +
                "\t\t\t\t<NumCasos>20</NumCasos>\n" +
                "\t\t\t</Advogado>\n" +
                "\t\t\t<Advogado>\n" +
                "\t\t\t\t<RegistroOAB>RJ456</RegistroOAB>\n" +
                "\t\t\t\t<Nome>Maria Santos</Nome>\n" +
                "\t\t\t\t<NumCasos>15</NumCasos>\n" +
                "\t\t\t</Advogado>\n" +
                "\t\t</Advogados>\n" +
                "\t</time>\n" +
                "</Socio>";

        assertEquals(esperado, visitor.exibir(socio));
    }
}
