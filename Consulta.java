package modelo.modelo;

import java.time.LocalDateTime;

public class Consulta {
    private String id;
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;

    public Consulta(String id, Paciente paciente, Medico medico, LocalDateTime dataHora) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public String getId() { return id; }
    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public LocalDateTime getDataHora() { return dataHora; }

    @Override
    public String toString() {
        return "Consulta{id='" + id + "', paciente=" + paciente.getNome() +
                ", medico=" + medico.getNome() + ", dataHora=" + dataHora + "}";
    }
}
