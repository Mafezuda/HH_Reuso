package modelo.relatorio;

import modelo.estrategia.EstrategiaExportacao;
import modelo.modelo.Paciente;
import modelo.template.TemplateRelatorio;

import java.util.List;

public class RelatorioPaciente extends TemplateRelatorio {
    private List<Paciente> pacientes;

    public RelatorioPaciente(List<Paciente> pacientes, EstrategiaExportacao estrategia) {
        super(estrategia);
        this.pacientes = pacientes;
    }

    @Override
    protected String construirConteudo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatório de Pacientes\n");
        for(Paciente p : pacientes) sb.append(p).append("\n");
        return sb.toString();
    }
}
