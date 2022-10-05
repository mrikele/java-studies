package QServidor;

public class TipoA extends Servidor {
    @Override
    public void ConectarServidor(){
        System.out.println("Conectando servidor");
    }
    @Override
    public void ExtrairDados(){
        System.out.println("Servidor do tipo A extraindo dados");
    }
    @Override
    public void ProcessarDados(){
        System.out.println("Servidor tipo A processando dados");
    }
    @Override
    public void EnviarBD(){
        System.out.println("Servidor tipo A enviando dados para o banco de dados");
    }
}
