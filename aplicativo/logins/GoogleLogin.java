package aplicativo.logins;
import aplicativo.Login;
import aplicativo.Usuario;

public class GoogleLogin implements Login {
    public GoogleLogin(Usuario usuario){};

    @Override
    public void Logar(){
        System.out.println( "Logando com o Google");
    }

      
}
