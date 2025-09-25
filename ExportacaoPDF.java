package modelo.estrategia;

public class ExportacaoPDF implements EstrategiaExportacao {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando PDF:\n" + conteudo);
    }
}
