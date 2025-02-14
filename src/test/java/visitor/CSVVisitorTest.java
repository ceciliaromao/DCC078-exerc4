package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVVisitorTest {
    @Test
    void deveExibirAdministrativo() {
        Administrativo administrativo = new Administrativo(123, "Joao Silva", 3589.97);
        CSVVisitor visitor = new CSVVisitor();

        String esperado = "id,nome,salarioBase\n123,Joao Silva,3589.97\n";

        assertEquals(esperado, visitor.exibir(administrativo));
    }

    @Test
    void deveExibirAdvogado() {
        Advogado advogado = new Advogado("MG123", "Joao Silva", 20);
        CSVVisitor visitor = new CSVVisitor();

        String esperado = "registroOAB,nome,numCasos\nMG123,Joao Silva,20\n";

        assertEquals(esperado, visitor.exibir(advogado));
    }

    @Test
    void deveExibirCliente() {
        Contrato contrato = new Contrato(123, "Contrato Pessoa Fisica");
        Cliente cliente = new Cliente("12345678901", "Joao Silva", contrato);
        CSVVisitor visitor = new CSVVisitor();

        String esperado = "cpf,nome,contrato,numeroContrato\n12345678901,Joao Silva,Contrato Pessoa Fisica,123\n";
        assertEquals(esperado, visitor.exibir(cliente));
    }

    @Test
    void deveExibirSocio() {
        Advogado advogado1 = new Advogado("MG123", "Joao Silva", 20);
        Advogado advogado2 = new Advogado("RJ456", "Maria Santos", 15);
        Advogado[] advogados = {advogado1, advogado2};
        Time time = new Time(advogados);
        Socio socio = new Socio("PA789", "Jose Oliveira", time);
        CSVVisitor visitor = new CSVVisitor();

        String esperado  = "registroOAB,nome,time\n" +
                "PA789,Jose Oliveira,[MG123 - Joao Silva - 20 casos;RJ456 - Maria Santos - 15 casos;]\n";

        assertEquals(esperado, visitor.exibir(socio));
    }
}
