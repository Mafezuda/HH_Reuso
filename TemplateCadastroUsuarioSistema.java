package modelo.template;

public abstract class TemplateCadastroUsuarioSistema {
    public final void executarCadastro(String usuario, String senha, String role) {
        validarEntrada(usuario, senha, role);
        processarCadastro(usuario, senha, role);
        registrarLog(usuario);
    }

    protected abstract void validarEntrada(String usuario, String senha, String role);

    protected abstract void processarCadastro(String usuario, String senha, String role);

    protected void registrarLog(String usuario) {
        System.out.println("[LOG] Usuário do sistema cadastrado: " + usuario);
    }
}
