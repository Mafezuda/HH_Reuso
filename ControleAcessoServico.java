package modelo.servico;

import java.util.*;

public class ControleAcessoServico {
    private static ControleAcessoServico instancia = null;
    private Map<String, Set<String>> usuariosRoles = new HashMap<>();

    private ControleAcessoServico() {}

    public static ControleAcessoServico getInstancia() {
        if (instancia == null) {
            instancia = new ControleAcessoServico();
        }
        return instancia;
    }

    public void atribuirRole(String usuario, String role) {
        usuariosRoles.computeIfAbsent(usuario, k -> new HashSet<>()).add(role);
    }

    public boolean temRole(String usuario, String role) {
        return usuariosRoles.getOrDefault(usuario, Collections.emptySet()).contains(role);
    }
}
