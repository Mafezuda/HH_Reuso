package modelo;

public class Receita {
    private String id;
    private Paciente paciente;
    private Medico medico;
    private String medicamento;

    public Receita(String id, Paciente paciente, Medico medico, String medicamento) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamento = medicamento;
    }

    public String getId() { return id; }
    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public String getMedicamento() { return medicamento; }

    @Override
    public String toString() {
        return "Receita{id='" + id + "', paciente=" + paciente.getNome() +
                ", medico=" + medico.getNome() + ", medicamento='" + medicamento + "'}";
    }
}
