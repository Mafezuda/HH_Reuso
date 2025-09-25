package modelo.estrategia;

public class ExportacaoConsole implements EstrategiaExportacao {
    public void exportar(String conteudo) { System.out.println(conteudo); }
}
