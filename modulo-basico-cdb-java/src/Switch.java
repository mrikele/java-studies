import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = -1;
		
		Scanner entrada = new Scanner(System.in);
		
		do { 
			System.out.println("Digite 1 para pagar boleto");
			System.out.println("Digite 2 para fazer transferência");
			System.out.println("Digite 0 para sair");
			
			opcao = entrada.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Pagando boleto");
				break;
			case 2:
				System.out.println("Fazendo transferencia");
				break;
			default: 
				if (opcao!=0) {
					System.out.println("Digite uma opção válida");
				} 
				break;
				}
			
		} while (opcao!=0);
		System.out.println("FIM!");
		entrada.close();
		}
}