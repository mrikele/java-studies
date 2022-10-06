package q2;

public abstract class Usuario {
    protected String nome;
    protected int idade;

    public Usuario(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void Cadastrar(){}
    public void Pagar(){}
}
