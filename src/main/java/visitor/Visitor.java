package visitor;

public interface Visitor {
    String exibirCliente(Cliente cliente);
    String exibirAdministrativo(Administrativo administrativo);
    String exibirAdvogado(Advogado advogado);
    String exibirSocio(Socio socio);
}
