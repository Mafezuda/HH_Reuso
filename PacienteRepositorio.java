package repositorio;

import modelo.Paciente;
import java.util.List;

public interface PacienteRepositorio {
    void salvar(Paciente paciente);
    Paciente buscarPorId(String id);
    List<Paciente> buscarTodos();
}
