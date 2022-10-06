package q2.usuarios;
import q2.Usuario;

public class Dev extends Usuario{
    private double salario;
    public Dev(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario=salario;
        //TODO Auto-generated constructor stub
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    @Override
    public void Cadastrar(){
        System.out.println("Dev sendo cadastrado");
    }
    @Override
    public void Pagar(){
        System.out.println(getSalario());

    }
}
