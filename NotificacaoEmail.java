package estrategia;

public class NotificacaoEmail implements EstrategiaNotificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
