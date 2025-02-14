package visitor;

public class Administrativo implements Pessoa {
    private int id;
    private String nome;
    private double salarioBase;

    public Administrativo(int id, String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAdministrativo(this);
    }
}
