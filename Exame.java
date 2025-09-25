package modelo.modelo;

public class Exame {
    private String id;
    private Paciente paciente;
    private String tipo;

    public Exame(String id, Paciente paciente, String tipo) {
        this.id = id;
        this.paciente = paciente;
        this.tipo = tipo;
    }

    public String getId() { return id; }
    public Paciente getPaciente() { return paciente; }
    public String getTipo() { return tipo; }

    @Override
    public String toString() {
        return "Exame{id='" + id + "', paciente=" + paciente.getNome() + ", tipo='" + tipo + "'}";
    }
}
