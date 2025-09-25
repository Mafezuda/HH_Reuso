package modelo.template;

public class GerenciamentoSenha extends TemplateGerenciamento {
    @Override
    protected void validarEntrada(String usuario, String dado) {
        if (usuario == null || usuario.isEmpty()) {
            throw new IllegalArgumentException("Usuário inválido!");
        }
        if (dado.length() < 6) {
            throw new IllegalArgumentException("Senha muito curta!");
        }
    }

    @Override
    protected void processar(String usuario, String dado) {
        System.out.println("Alterando senha do usuário: " + usuario + " para nova senha: " + dado);
    }
}
