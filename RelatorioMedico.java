package modelo.relatorio;

import modelo.estrategia.EstrategiaExportacao;
import modelo.modelo.Medico;
import modelo.template.TemplateRelatorio;

import java.util.List;

public class RelatorioMedico extends TemplateRelatorio {
    private List<Medico> medicos;

    public RelatorioMedico(List<Medico> medicos, EstrategiaExportacao estrategia) {
        super(estrategia);
        this.medicos = medicos;
    }

    @Override
    protected String construirConteudo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatório de Médicos\n");
        for(Medico m : medicos) sb.append(m).append("\n");
        return sb.toString();
    }
}
