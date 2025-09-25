package template;

public class CadastroUsuario extends TemplateGerenciamento {
    @Override
    protected void validarEntrada(String usuario, String dado) {
        if (usuario == null || usuario.isEmpty()) {
            throw new IllegalArgumentException("Usuário inválido!");
        }
        if (dado == null || dado.isEmpty()) {
            throw new IllegalArgumentException("Senha inválida!");
        }
    }

    @Override
    protected void processar(String usuario, String dado) {
        System.out.println("Cadastrando usuário: " + usuario + " com senha: " + dado);
        // Aqui entraria a lógica de persistência
    }
}
