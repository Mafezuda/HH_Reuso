package servico;

import modelo.Consulta;
import java.util.*;

public class AgendaServico {
    private static AgendaServico instancia = null;
    private List<Consulta> consultas = new ArrayList<>();

    private AgendaServico() {}

    public static AgendaServico getInstancia() {
        if (instancia == null) {
            instancia = new AgendaServico();
        }
        return instancia;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> listarConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public List<Consulta> listarConsultasPorPaciente(String pacienteId) {
        List<Consulta> resultado = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getPaciente().getId().equals(pacienteId)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public List<Consulta> listarConsultasPorMedico(String medicoId) {
        List<Consulta> resultado = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getMedico().getId().equals(medicoId)) {
                resultado.add(c);
            }
        }
        return resultado;
    }
}
