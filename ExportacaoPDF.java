package relatorio;

public class ExportacaoPDF implements EstrategiaExportacao {
    public void exportar(String conteudo) {
        System.out.println("Exportando PDF:\n" +
