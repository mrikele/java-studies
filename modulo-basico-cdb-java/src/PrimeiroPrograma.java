import java.util.Scanner;
public class PrimeiroPrograma {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//System.out.println("Hello, World! :)"); //println imprime na próxima linha
			//System.out.print("Esse sistema é muito fácil! :0 "); //imprime junto
			
			Scanner entrada = new Scanner(System.in); //entrada de sistema via terminal
			System.out.print("Olá, por favor informe o seu nome: >>> ");
			String nome = entrada.next(); //variavel efetivamente pedindo input
			
			System.out.println("Seja muito bem vindo " + nome + " ao curso de java!");
		}

	}

