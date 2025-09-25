package repositorio;

import modelo.Paciente;
import java.util.*;

public class MemoriaPacienteRepositorio implements PacienteRepositorio {
    private Map<String, Paciente> armazenamento = new HashMap<>();

    public void salvar(Paciente paciente) { armazenamento.put(paciente.getId(), paciente); }
    public Paciente buscarPorId(String id) { return armazenamento.get(id); }
    public List<Paciente> buscarTodos() { return new ArrayList<>(armazenamento.values()); }
}
