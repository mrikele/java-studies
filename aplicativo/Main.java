package aplicativo;
import aplicativo.logins.AppleLogin;
import aplicativo.logins.Formulario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Maria", "maria123@gmail.com");
        AppleLogin loging1 = new AppleLogin(usuario1);
        System.out.println(usuario1.getNome()); 
        loging1.Logar();

        Usuario usuario2 = new Usuario("Rikele", "rikele123@gmail.com");
        Formulario loging2 = new Formulario(usuario2);
        System.out.println(usuario2.getNome()); 
        loging2.Logar();
    }
}
