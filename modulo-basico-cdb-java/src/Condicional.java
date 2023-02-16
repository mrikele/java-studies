import java.text.MessageFormat;
import java.util.Scanner;


public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		boolean isOk = false;
		String resposta;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite mais um número:  ");
		numero2 = entrada.nextInt();
		
		isOk = (numero1>numero2);
		
		if (isOk==true) {
			resposta = MessageFormat.format("o número {0} é maior que o número {1}",numero1, numero2);
		} else {
			resposta = MessageFormat.format("o número {0} é menor que o número {1}",numero1, numero2);
		}
		
		System.out.println(resposta);
		
		entrada.close();
	}

}
