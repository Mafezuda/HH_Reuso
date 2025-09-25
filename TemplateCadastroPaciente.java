package modelo.template;

import modelo.modelo.Paciente;

public abstract class TemplateCadastroPaciente {
    public final void executarCadastro(String id, String nome, int idade) {
        validarEntrada(id, nome, idade);
        processarCadastro(id, nome, idade);
        registrarLog(id, nome);
    }

    protected abstract void validarEntrada(String id, String nome, int idade);

    protected abstract void processarCadastro(String id, String nome, int idade);

    protected void registrarLog(String id, String nome) {
        System.out.println("[LOG] Paciente cadastrado: " + nome + " (ID: " + id + ")");
    }
}
