package servico;

import java.util.Properties;

public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia = null;
    private Properties propriedades = new Properties();

    private ConfiguracaoSistema() {
        propriedades.setProperty("versao", "1.0");
        propriedades.setProperty("modo", "teste");
    }

    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public String getPropriedade(String chave) {
        return propriedades.getProperty(chave);
    }

    public void setPropriedade(String chave, String valor) {
        propriedades.setProperty(chave, valor);
    }
}
