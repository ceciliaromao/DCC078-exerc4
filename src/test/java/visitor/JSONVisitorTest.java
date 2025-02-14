package visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JSONVisitorTest {
    @Test
    void deveExibirAdministrativo() {
        Administrativo administrativo = new Administrativo(123, "Joao Silva", 3589.97);
        JSONVisitor visitor = new JSONVisitor();

        String esperado = "Administrativo: {\n" +
                "\t\"id\": \"123\",\n" +
                "\t\"nome\": \"Joao Silva\",\n" +
                "\t\"salarioBase\": 3589.97\n" +
                "}";

        assertEquals(esperado, visitor.exibir(administrativo));
    }

    @Test
    void deveExibirAdvogado() {
        Advogado advogado = new Advogado("MG123", "Joao Silva", 20);
        JSONVisitor visitor = new JSONVisitor();

        String esperado = "Advogado: {\n" +
                "\t\"registroOAB\": \"MG123\",\n" +
                "\t\"nome\": \"Joao Silva\",\n" +
                "\t\"numCasos\": 20\n" +
                "}";

        assertEquals(esperado, visitor.exibir(advogado));
    }

    @Test
    void deveExibirCliente() {
        Contrato contrato = new Contrato(123, "Contrato Pessoa Fisica");
        Cliente cliente = new Cliente("12345678901", "Joao Silva", contrato);
        JSONVisitor visitor = new JSONVisitor();

        String esperado = "Cliente: {\n" +
                "\t\"cpf\": \"12345678901\",\n" +
                "\t\"nome\": \"Joao Silva\",\n" +
                "\t\"contrato\": \"Contrato Pessoa Fisica\",\n" +
                "\t\"numeroContrato\": 123\n" +
                "}";
        assertEquals(esperado, visitor.exibir(cliente));
    }

    @Test
    void deveExibirSocio() {
        Advogado advogado1 = new Advogado("MG123", "Joao Silva", 20);
        Advogado advogado2 = new Advogado("RJ456", "Maria Santos", 15);
        Advogado[] advogados = {advogado1, advogado2};
        Time time = new Time(advogados);
        Socio socio = new Socio("PA789", "Jose Oliveira", time);
        JSONVisitor visitor = new JSONVisitor();

        String esperado  = "Socio: {\n" +
                "\t\"registroOAB\": \"PA789\",\n" +
                "\t\"nome\": \"Jose Oliveira\",\n" +
                "\t\"time\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"registroOAB\": \"MG123\",\n" +
                "\t\t\t\"nome\": \"Joao Silva\",\n" +
                "\t\t\t\"numCasos\": 20\",\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"registroOAB\": \"RJ456\",\n" +
                "\t\t\t\"nome\": \"Maria Santos\",\n" +
                "\t\t\t\"numCasos\": 15\",\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";

        assertEquals(esperado, visitor.exibir(socio));
    }
}
