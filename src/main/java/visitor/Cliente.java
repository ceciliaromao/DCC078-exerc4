package visitor;

public class Cliente implements Pessoa{
    private String cpf;
    private String nome;
    private Contrato contrato;

    public Cliente(String cpf, String nome, Contrato contrato) {
        this.cpf = cpf;
        this.nome = nome;
        this.contrato = contrato;
    }

    public String getCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getServicoContrato() {
        return this.contrato.getServico();
    }

    public int getNumeroContrato() {
        return this.contrato.getNumero();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
