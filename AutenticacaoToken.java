package modelo.estrategia;

public class AutenticacaoToken implements EstrategiaAutenticacao {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return credencial.startsWith("TOKEN-");
    }
}
