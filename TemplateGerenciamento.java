package template;

public abstract class TemplateGerenciamento {
    public final void executarProcesso(String usuario, String dado) {
        validarEntrada(usuario, dado);
        processar(usuario, dado);
        registrarLog(usuario);
    }

    protected abstract void validarEntrada(String usuario, String dado);
    protected abstract void processar(String usuario, String dado);
    protected void registrarLog(String usuario) {
        System.out.println("[LOG] Ação executada para usuário: " + usuario);
    }
}
