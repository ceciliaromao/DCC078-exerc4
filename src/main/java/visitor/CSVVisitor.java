package visitor;

public class CSVVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "cpf,nome,contrato,numeroContrato\n" +
                cliente.getCPF() + "," + cliente.getNome() + "," + cliente.getServicoContrato() + "," + cliente.getNumeroContrato() + "\n";
    }

    @Override
    public String exibirAdministrativo(Administrativo administrativo) {
        return "id,nome,salarioBase\n" +
               administrativo.getId() + "," + administrativo.getNome() + "," + administrativo.getSalarioBase() + "\n";
    }

    @Override
    public String exibirAdvogado(Advogado advogado) {
        return "registroOAB,nome,numCasos\n" +
                advogado.getRegistroOAB() + "," + advogado.getNome() + "," + advogado.getNumCasos() + "\n";
    }

    public String exibirSocio(Socio socio) {
        return "registroOAB,nome,time\n" +
                socio.getRegistroOAB() + "," + socio.getNome() + "," + socio.getCSVTime() + "\n";
    }
}
