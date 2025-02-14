package visitor;

public class Contrato {
    private int numero;
    private String servico;

    public Contrato(int numero, String servico) {
        this.numero = numero;
        this.servico = servico;
    }

    public String getServico() {
        return servico;
    }

    public int getNumero() {
        return numero;
    }
}
