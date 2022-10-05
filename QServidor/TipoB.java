package QServidor;

public class TipoB extends Servidor{
    @Override
    public void ExtrairDados(){
        System.out.println("Servidor do tipo B extraindo dados");
    }
    @Override
    public void ProcessarDados(){
        System.out.println("Servidor tipo B processando dados");
    }
    @Override
    public void EnviarBD(){
        System.out.println("Servidor tipo B enviando dados para o banco de dados");
    }
}
