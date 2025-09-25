package modelo.template;

public class CadastroUsuarioSistema extends TemplateCadastroUsuarioSistema {

    @Override
    protected void validarEntrada(String usuario, String senha, String role) {
        if (usuario == null || usuario.isEmpty()) throw new IllegalArgumentException("Usuário inválido!");
        if (senha == null || senha.length() < 6) throw new IllegalArgumentException("Senha muito curta!");
        if (role == null || role.isEmpty()) throw new IllegalArgumentException("Role inválida!");
    }

    @Override
    protected void processarCadastro(String usuario, String senha, String role) {
        System.out.println("Administrador cadastrou o usuário: " + usuario + " com role: " + role);
    }
}
