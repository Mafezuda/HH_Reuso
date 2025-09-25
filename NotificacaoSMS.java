package estrategia;

public class NotificacaoSMS implements EstrategiaNotificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
