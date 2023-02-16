import java.text.MessageFormat;
public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 1+1;
		int subtracao = 1-1;
		int divisao = 7/3;
		double divisaoDouble = 7.0/3.0;
		double multiplicacao = 5.5*2;
		int modulo = 7%3;
		
		String mensagem = MessageFormat.format(
		" A soma {0}" 
		+ "\n a subtração {1}"
		+ "\n a divisao e a divisão inteira {2} e {3}" 
		+ "\n a multiplicação {4}" 
		+ "\n e o modulo {5}", soma, subtracao, divisao, divisaoDouble, multiplicacao, modulo);
		System.out.println(mensagem);
	
	}

}
