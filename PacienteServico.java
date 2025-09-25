package servico;

import modelo.Paciente;
import repositorio.PacienteRepositorio;
import java.util.List;

public class PacienteServico {
    private static PacienteServico instancia;
    private PacienteRepositorio repo;

    private PacienteServico(PacienteRepositorio repo) { 
        this.repo = repo; 
    }

    public static PacienteServico getInstancia(PacienteRepositorio repo) {
        if (instancia == null) {
            instancia = new PacienteServico(repo);
        }
        return instancia;
    }

    public void registrarPaciente(Paciente paciente) { 
        repo.salvar(paciente); 
    }

    public Paciente obterPaciente(String id) { 
        return repo.buscarPorId(id); 
    }

    public List<Paciente> obterTodosPacientes() { 
        return repo.buscarTodos(); 
    }
}
