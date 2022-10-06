package q2;

import q2.usuarios.Gerente;
import q2.usuarios.Dev;
import q2.usuarios.Lider;

public class Main {
    public static void main(String[] args){

        Gerente ger = new Gerente("Jose", 23, 1000);
        ger.Cadastrar();
        ger.Pagar();

        Dev dev = new Dev("Joao", 20, 1000);
        dev.Cadastrar();
        dev.Pagar();

        Lider lider = new Lider("Jose", 23, 1000);
        lider.Cadastrar();
        lider.Pagar();

    }
}
