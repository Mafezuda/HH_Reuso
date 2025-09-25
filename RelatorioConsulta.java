package modelo.relatorio;

import modelo.estrategia.EstrategiaExportacao;
import modelo.modelo.Consulta;
import modelo.template.TemplateRelatorio;

import java.util.List;

public class RelatorioConsulta extends TemplateRelatorio {
    private List<Consulta> consultas;

    public RelatorioConsulta(List<Consulta> consultas, EstrategiaExportacao estrategia) {
        super(estrategia);
        this.consultas = consultas;
    }

    @Override
    protected String construirConteudo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatório de Consultas\n");
        for(Consulta c : consultas) sb.append(c).append("\n");
        return sb.toString();
    }
}
