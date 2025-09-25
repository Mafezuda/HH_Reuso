package modelo.estrategia;

public interface EstrategiaAutenticacao {
    boolean autenticar(String usuario, String credencial);
}
