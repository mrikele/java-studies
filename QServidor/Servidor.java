package QServidor;

public abstract class Servidor {
    public void ConectarServidor(){
        System.out.println("Conectando servidor");
    }
    public void ExtrairDados(){
        System.out.println("Extraindo dados do servidor");
    }
    public void ProcessarDados(){
        System.out.println("Processando dados do servidor");
    }
    public void EnviarBD(){
        System.out.println("Enviando dados para o banco de dados");
    }
}
