import java.util.Scanner;

public class Exercicio1038 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo, qtde;
		double total;
		
		codigo = teclado.nextInt();
		qtde   = teclado.nextInt();
		
		if (codigo == 1) {
			total = 4.00 * qtde;
		}
		else if (codigo == 2) {
			total = 4.50 * qtde;
		}
		else if (codigo == 3) {
			total = 5.00 * qtde;
		}
		else if (codigo == 4) {
			total = 2.00 * qtde;
		}
		else {
			total = 1.50 * qtde;
		}
		
		System.out.printf("Total: R$ %.2f\n", total);
		
	}
}