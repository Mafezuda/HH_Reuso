package modelo.template;

import modelo.modelo.Paciente;
import modelo.servico.PacienteServico;
import modelo.repositorio.PacienteRepositorio;

public class CadastroPacienteRecepcionista extends TemplateCadastroPaciente {

    private PacienteServico pacienteServico;

    public CadastroPacienteRecepcionista(PacienteServico pacienteServico) {
        this.pacienteServico = pacienteServico;
    }

    @Override
    protected void validarEntrada(String id, String nome, int idade) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("ID inválido!");
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome inválido!");
        if (idade <= 0) throw new IllegalArgumentException("Idade inválida!");
    }

    @Override
    protected void processarCadastro(String id, String nome, int idade) {
        Paciente paciente = new Paciente(id, nome, idade);
        pacienteServico.registrarPaciente(paciente);
        System.out.println("Recepcionista cadastrou o paciente: " + nome);
    }
}
