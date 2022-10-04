package aplicativo.logins;
import aplicativo.Login;
import aplicativo.Usuario;

public class FacebookLogin implements Login{
    public FacebookLogin(Usuario usuario){};

    @Override
    public void Logar(){
        System.out.println("Logando com o Facebook");
    };
}
