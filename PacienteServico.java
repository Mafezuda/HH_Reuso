package modelo;

public class PacienteServico {
    private static PacienteServico instancia;

    private PacienteServico() {
    }

    public static PacienteServico getInstancia() {
        if (instancia == null) {
            instancia = new PacienteServico();
        }
        return instancia;
    }

    public void cadastrarPaciente(Paciente paciente) {
        System.out.println("Paciente cadastrado: " + paciente.getNome());
    }

    public void listarPacientes() {
        System.out.println("Listando pacientes...");
    }
}
