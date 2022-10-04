package aplicativo.logins;
import aplicativo.Login;
import aplicativo.Usuario;

public class Formulario implements Login {
    public Formulario(Usuario usuario){};

    @Override
    public void Logar(){
        System.out.println("logando com formulario");
    };
    
}
