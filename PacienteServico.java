package modelo.servico;

import modelo.modelo.Paciente;
import modelo.repositorio.PacienteRepositorio;
import java.util.List;

public class PacienteServico {
    private PacienteRepositorio repo;
    public PacienteServico(PacienteRepositorio repo) { this.repo = repo; }
    public void registrarPaciente(Paciente paciente) { repo.salvar(paciente); }
    public Paciente obterPaciente(String id) { return repo.buscarPorId(id); }
    public List<Paciente> obterTodosPacientes() { return repo.buscarTodos(); }
}
