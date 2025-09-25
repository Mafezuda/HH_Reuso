package modelo.estrategia;

public class AutenticacaoSenha implements EstrategiaAutenticacao {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return "senha123".equals(credencial);
    }
}
