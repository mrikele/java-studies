
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldo;
		saldo = 50.00;
		
		boolean isOk = false;
		
		// && Conjunção aditiva
		// || Conjunção alternativa
		
		isOk = (saldo>10 && saldo<100);
		System.out.println(isOk);
		
		isOk = (saldo>10 || saldo<40);
		System.out.println(isOk);
		
		isOk = (saldo>10 && saldo ==50.00 && saldo<100);
		System.out.println(isOk);
		
		isOk = (saldo!=0);
		System.out.println(isOk);
	}

}
