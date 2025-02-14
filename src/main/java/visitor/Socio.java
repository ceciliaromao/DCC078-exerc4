package visitor;

public class Socio implements Pessoa {
    private String registroOAB;
    private String nome;
    private Time time;

    public Socio(String registroOAB, String nome, Time time) {
        this.registroOAB = registroOAB;
        this.nome = nome;
        this.time = time;
    }

    public String getRegistroOAB() {
        return registroOAB;
    }

    public String getNome() {
        return nome;
    }

    public String getJSONTime() {
        return this.time.getJSONAdvogados();
    }

    public String getXMLTime() {
        return this.time.getXMLAdvogados();
    }

    public String getCSVTime() {
        return this.time.getCSVAdvogados();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSocio(this);
    }
}
