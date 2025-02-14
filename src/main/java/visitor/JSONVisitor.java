package visitor;

public class JSONVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente: {\n" +
                    "\t\"cpf\": \"" + cliente.getCPF() + "\",\n" +
                    "\t\"nome\": \"" + cliente.getNome() + "\",\n" +
                    "\t\"contrato\": \"" + cliente.getServicoContrato() + "\",\n" +
                    "\t\"numeroContrato\": " + cliente.getNumeroContrato() +
                "\n}";
    }

    @Override
    public String exibirAdministrativo(Administrativo administrativo) {
        return "Administrativo: {\n" +
                    "\t\"id\": \"" + administrativo.getId() + "\",\n" +
                    "\t\"nome\": \"" + administrativo.getNome() + "\",\n" +
                    "\t\"salarioBase\": " + administrativo.getSalarioBase() +
                "\n}";
    }

    @Override
    public String exibirAdvogado(Advogado advogado) {
        return "Advogado: {\n" +
                    "\t\"registroOAB\": \"" + advogado.getRegistroOAB() + "\",\n" +
                    "\t\"nome\": \"" + advogado.getNome() + "\",\n" +
                    "\t\"numCasos\": " + advogado.getNumCasos() +
                "\n}";
    }

    public String exibirSocio(Socio socio) {
        return "Socio: {\n" +
                    "\t\"registroOAB\": \"" + socio.getRegistroOAB() + "\",\n" +
                    "\t\"nome\": \"" + socio.getNome() + "\",\n" +
                    "\t\"time\": " + socio.getJSONTime() +
                "\n}";
    }
}
