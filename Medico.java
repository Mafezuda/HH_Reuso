package modelo.modelo;

public class Medico {
    private String id;
    private String nome;
    private String especialidade;

    public Medico(String id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }

    @Override
    public String toString() {
        return "Medico{id='" + id + "', nome='" + nome + "', especialidade='" + especialidade + "'}";
    }
}
