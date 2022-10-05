package QServidor;

public class Main {
    public static void main(String[] args) {

    TipoA servidorA = new TipoA();
    servidorA.ConectarServidor();
    servidorA.ExtrairDados();
    servidorA.ProcessarDados();
    servidorA.EnviarBD();

    TipoB servidorB = new TipoB();
    servidorB.ConectarServidor();
    servidorB.ExtrairDados();
    servidorB.ProcessarDados();
    servidorB.EnviarBD();
    }
}
