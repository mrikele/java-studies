package aplicativo.logins;
import aplicativo.Login;
import aplicativo.Usuario;

public class AppleLogin implements Login{
    public AppleLogin(Usuario usuario){};
    
    @Override
    public void Logar(){
        System.out.println( "logando com Apple Login");
    }
}