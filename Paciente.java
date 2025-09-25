package modelo;

public class Paciente {
    private String id;
    private String nome;
    private int idade;

    public Paciente(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    @Override
    public String toString() {
        return "Paciente{id='" + id + "', nome='" + nome + "', idade=" + idade + "}";
    }
}
