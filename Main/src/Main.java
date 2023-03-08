import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroItens=0;
		double preco;
		double total;
		
		// versao DO-while
		total = 0.0;
		do {
			System.out.print("Preco do produto:");
			preco = teclado.nextDouble();
			if (preco > 0) {
				numeroItens++;
				total += preco;
			}
		} while (preco > 0);
		System.out.println("Total da compra R$ " + total);
		System.out.println("Itens comprados: " + numeroItens);
		System.out.println("Preco medio dos produtos R$ " + (total/numeroItens));
		
		// versao WHILE
//		while (numero != -1) {
//			System.out.print("digite um numero:");
//			numero = teclado.nextInt();
//			System.out.println("----> digitado = "+numero);
//		}
		
		// versao FOR
//		for(numero = 0 ; numero != -1 ; ) {
//			System.out.print("digite um numero:");
//			numero = teclado.nextInt();
//			System.out.println("---> digitado = " + numero);
//		}
		
		
		
		System.out.println("***** FIM *******");
		
		
		
		
	}
}

