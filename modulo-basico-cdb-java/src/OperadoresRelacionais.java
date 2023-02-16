
public class OperadoresRelacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMaior = false; //declarar e inicializar
		boolean isMenos = false;
		boolean isIgual = false;
		boolean isDiferente = false;
		
		int valor;
		valor = 1;
		
		int novoValor;
		novoValor = valor+1;
		
		isMaior = (valor > novoValor);
		System.out.println(isMaior);
		
		isMaior = (novoValor > valor);
		System.out.println(isMaior);
		
		isIgual = (novoValor==valor);
		System.out.println(isIgual);
		
		isDiferente = (novoValor!=valor);
		System.out.println(isDiferente);
		
	}

}
