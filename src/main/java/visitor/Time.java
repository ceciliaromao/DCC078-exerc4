package visitor;

public class Time {
    private Advogado[] advogados;

    public Time(Advogado[] advogados) {
        this.advogados = advogados;
    }

    public String getJSONAdvogados(){
        StringBuilder resultado = new StringBuilder();

        resultado.append("[\n");
        for (int i = 0; i < advogados.length; i++) {
            Advogado advogado = advogados[i];
            resultado.append("\t\t{\n")
                .append("\t\t\t\"registroOAB\": \"").append(advogado.getRegistroOAB()).append("\",\n")
                .append("\t\t\t\"nome\": \"").append(advogado.getNome()).append("\",\n")
                .append("\t\t\t\"numCasos\": ").append(advogado.getNumCasos()).append("\",\n")
                .append("\t\t}");
            if (i < advogados.length - 1) {
                resultado.append(",\n");
            }
        }
        resultado.append("\n\t]");

        return resultado.toString();
    }

    public String getXMLAdvogados() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("\n\t\t<Advogados>\n");
        for (Advogado advogado : advogados) {
            resultado.append("\t\t\t<Advogado>\n")
                    .append("\t\t\t\t<RegistroOAB>").append(advogado.getRegistroOAB()).append("</RegistroOAB>\n")
                    .append("\t\t\t\t<Nome>").append(advogado.getNome()).append("</Nome>\n")
                    .append("\t\t\t\t<NumCasos>").append(advogado.getNumCasos()).append("</NumCasos>\n")
                    .append("\t\t\t</Advogado>\n");
        }
        resultado.append("\t\t</Advogados>\n");

        return resultado.toString();
    }

    public String getCSVAdvogados() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("[");
        for (Advogado advogado : advogados) {
            resultado.append(advogado.getRegistroOAB()).append(" - ")
                    .append(advogado.getNome()).append(" - ")
                    .append(advogado.getNumCasos()).append(" casos;");
        }
        resultado.append("]");
        return resultado.toString();
    }
}
