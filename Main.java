package main;

import modelo.*;
import servico.*;
import relatorio.*;
import estrategia.*;
import template.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DO SISTEMA ===\n");

        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();
        System.out.println("Versão do sistema: " + config.getPropriedade("versao"));
        config.setPropriedade("modo", "produção");
        System.out.println("Modo atualizado: " + config.getPropriedade("modo"));

        PacienteServico pacienteServico = PacienteServico.getInstancia();
        Paciente p1 = new Paciente("p1", "Maria", 30);
        Paciente p2 = new Paciente("p2", "José", 45);
        pacienteServico.registrarPaciente(p1);
        pacienteServico.registrarPaciente(p2);

        Medico m1 = new Medico("m1", "Dr. João", "Cardiologia");

        Exame e1 = new Exame("e1", p1, "Sangue");
        Receita r1 = new Receita("r1", p1, m1, "Dipirona");

        Consulta c1 = new Consulta("c1", p1, m1, "2025-09-26");


        AgendaServico agenda = AgendaServico.getInstancia();
        agenda.adicionarConsulta(c1);

        System.out.println("\nConsultas agendadas:");
        for (Consulta c : agenda.listarConsultas()) {
            System.out.println(c);
        }


        System.out.println("\n--- Gerenciamento de Usuários ---");
        TemplateGerenciamento cadastro = new CadastroUsuario();
        cadastro.executarProcesso("usuario1", "senha123");

        TemplateGerenciamento senha = new GerenciamentoSenha();
        senha.executarProcesso("usuario1", "novaSenhaSegura");


        System.out.println("\n--- Estratégia de Exportação ---");
        EstrategiaExportacao exportacaoPDF = new ExportacaoPDF();
        EstrategiaExportacao exportacaoCSV = new ExportacaoCSV();

        RelatorioPaciente relPac = new RelatorioPaciente(pacienteServico.obterTodosPacientes(), exportacaoPDF);
        relPac.gerarRelatorio();

        RelatorioReceita relRec = new RelatorioReceita(Arrays.asList(r1), exportacaoCSV);
        relRec.gerarRelatorio();

        System.out.println("\n--- Estratégia de Autenticação ---");
        EstrategiaAutenticacao authSenha = new AutenticacaoSenha();
        EstrategiaAutenticacao authToken = new AutenticacaoToken();

        System.out.println("Login senha: " + authSenha.autenticar("usuario1", "senha123"));
        System.out.println("Login token: " + authToken.autenticar("usuario1", "TOKEN-123"));


        System.out.println("\n--- Estratégia de Notificação ---");
        EstrategiaNotificacao notifEmail = new NotificacaoEmail();
        EstrategiaNotificacao notifSMS = new NotificacaoSMS();

        notifEmail.notificar("Consulta marcada com " + m1.getNome());
        notifSMS.notificar("Resultado de exame disponível.");


        System.out.println("\n--- Controle de Acesso ---");
        ControleAcessoServico acesso = ControleAcessoServico.getInstancia();
        acesso.atribuirRole("usuario1", "ADMIN");
        System.out.println("Usuário1 tem role ADMIN? " + acesso.temRole("usuario1", "ADMIN"));

        System.out.println("\n=== FIM DA DEMONSTRAÇÃO ===");
    }
}
