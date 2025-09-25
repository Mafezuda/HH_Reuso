package repositorio;

import modelo.Paciente;
import java.util.*;

public class MemoriaPacienteRepositorio implements PacienteRepositorio {
    private static MemoriaPacienteRepositorio instancia;
    private Map<String, Paciente> armazenamento = new HashMap<>();

    private MemoriaPacienteRepositorio() {}

    public static MemoriaPacienteRepositorio getInstancia() {
        if (instancia == null) {
            instancia = new MemoriaPacienteRepositorio();
        }
        return instancia;
    }

    @Override
    public void salvar(Paciente paciente) { 
        armazenamento.put(paciente.getId(), paciente); 
    }

    @Override
    public Paciente buscarPorId(String id) { 
        return armazenamento.get(id); 
    }

    @Override
    public List<Paciente> buscarTodos() { 
        return new ArrayList<>(armazenamento.values()); 
    }
}
