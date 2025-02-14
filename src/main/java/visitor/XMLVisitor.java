package visitor;

public class XMLVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "<Cliente>\n" +
                    "\t<cpf>" + cliente.getCPF() + "</cpf>\n" +
                    "\t<nome>" + cliente.getNome() + "</nome>\n" +
                    "\t<contrato>" + cliente.getServicoContrato() + "</contrato>\n" +
                    "\t<numeroContrato>" + cliente.getNumeroContrato() + "</numeroContrato>\n" +
                "</Cliente>";
    }

    @Override
    public String exibirAdministrativo(Administrativo administrativo) {
        return "<Administrativo>\n" +
                    "\t<id>" + administrativo.getId() + "</id>\n" +
                    "\t<nome>" + administrativo.getNome() + "</nome>\n" +
                    "\t<salarioBase>" + administrativo.getSalarioBase() + "</salarioBase>\n" +
                "</Administrativo>";
    }

    @Override
    public String exibirAdvogado(Advogado advogado) {
        return "<Advogado>\n" +
                    "\t<registroOAB>" + advogado.getRegistroOAB() + "</registroOAB>\n" +
                    "\t<nome>" + advogado.getNome() + "</nome>\n" +
                    "\t<numCasos>" + advogado.getNumCasos() + "</numCasos>\n" +
                "</Advogado>";
    }

    public String exibirSocio(Socio socio) {
        return "<Socio>\n" +
                    "\t<registroOAB>" + socio.getRegistroOAB() + "</registroOAB>\n" +
                    "\t<nome>" + socio.getNome() + "</nome>\n" +
                    "\t<time>" + socio.getXMLTime() + "\t</time>\n" +
                "</Socio>";
    }
}
