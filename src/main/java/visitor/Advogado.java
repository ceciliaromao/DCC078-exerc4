package visitor;

public class Advogado implements Pessoa {
    private String registroOAB;
    private String nome;
    private int numCasos;

    public Advogado(String registroOAB, String nome, int numCasos) {
        this.registroOAB = registroOAB;
        this.nome = nome;
        this.numCasos = numCasos;
    }

    public String getRegistroOAB() {
        return registroOAB;
    }

    public String getNome() {
        return nome;
    }

    public int getNumCasos() {
        return numCasos;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAdvogado(this);
    }
}
