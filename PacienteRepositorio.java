package modelo.repositorio;

import modelo.modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepositorio {
    private List<Paciente> pacientes = new ArrayList<>();

    public void salvar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Paciente buscarPorId(String id) {
        for (Paciente p : pacientes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Paciente> buscarTodos() {
        return new ArrayList<>(pacientes);
    }
}
