package relatorio;

public abstract class TemplateRelatorio {
    protected EstrategiaExportacao estrategiaExportacao;

    public TemplateRelatorio(EstrategiaExportacao estrategiaExportacao) {
        this.estrategiaExportacao = estrategiaExportacao;
    }

    public final void gerarRelatorio() {
        String conteudo = construirConteudo();
        estrategiaExportacao.exportar(conteudo);
    }

    protected abstract String construirConteudo();
}
